package com.xyy.config;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * NettyConfig
 * com.xyy.config
 *
 * @author Xander
 * @Description
 * @Date 2019-07-03 09:19
 * The word 'impossible' is not in my dictionary.
 */
@Component
@ConfigurationProperties(prefix = "netty")
public class NettyConfig {
    /**
     * 存储每一个客户端接入进来时的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
