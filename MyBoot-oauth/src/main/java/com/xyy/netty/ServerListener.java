package com.xyy.netty;

import com.xyy.config.NettyConfig;
import com.xyy.util.NettyConstants;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.ServerSocketChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


/**
 * @Description netty server listener
 * @author Xander
 * @Date 2019-07-05 10:06
 * @see com.xyy.netty
 * The word 'impossible' is not in my dictionary.
 */
@Component
public class ServerListener {
	/**
	 * NettyServerListener 日志输出器
	 *
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(ServerListener.class);
	/**
	 * 创建bootstrap
	 */
	ServerBootstrap bootstrap = new ServerBootstrap();
	//服务端要建立两个group，一个负责接收客户端的连接，一个负责处理数据传输
	//连接处理group
	EventLoopGroup boss = new NioEventLoopGroup();
	//事件处理group
	EventLoopGroup work = new NioEventLoopGroup();

	//NETT服务器配置类
	@Resource
	private NettyConfig nettyConfig;

//	private ServerSocketChannel serverSocketChannel;

//	public void sendMessage(Object msg){
//		if(serverSocketChannel != null){
//			serverSocketChannel.writeAndFlush(msg);
//		}
//	}

	/**
	 * 开启及服务线程
	 */
//	@PostConstruct
	public void start() {
		// 从配置文件中(application.yml)获取服务端监听端口号
		int port = nettyConfig.getPort();

		// 绑定处理group
		bootstrap.group(boss, work).channel(NioServerSocketChannel.class)
				//保持连接数
				.option(ChannelOption.SO_BACKLOG, 128)
				//有数据立即发送
				.option(ChannelOption.TCP_NODELAY, true)
				//保持连接
				.childOption(ChannelOption.SO_KEEPALIVE, true);
		//处理新连接
		bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
					@Override
					protected void initChannel(SocketChannel sc) throws Exception {
				// 增加任务处理
				ChannelPipeline pipeline = sc.pipeline();
				pipeline.addLast(
//										//使用了netty自带的编码器和解码器
//										new StringDecoder(Charset.forName("utf-8")),
//										new StringEncoder(Charset.forName("utf-8")),
						new MessageDecoder(),
						new MessageEncoder());
				//自定义的处理器
				pipeline.addLast(new ServerHandler());
			}
		});
		try {
			//绑定端口，同步等待成功
			ChannelFuture future = bootstrap.bind(port).sync();
			if (future.isSuccess()) {
//				serverSocketChannel = (ServerSocketChannel) future.channel();
				LOGGER.info("netty服务器在[{}]端口启动监听", port);
			} else {
				LOGGER.info("服务端开启失败");
			}
			//等待服务监听端口关闭,就是由于这里会将线程阻塞，导致无法发送信息，所以我这里开了线程
			future.channel().closeFuture().sync();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//优雅地退出，释放线程池资源
			LOGGER.info("[出现异常] 释放资源");
			boss.shutdownGracefully();
			work.shutdownGracefully();
		}
	}

	/**
	 * 关闭服务器方法
	 */
	@PreDestroy
	public void close() {
		LOGGER.info("关闭服务器....");
		//优雅退出
		boss.shutdownGracefully();
		work.shutdownGracefully();
	}

}
