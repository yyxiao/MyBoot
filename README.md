# MyBoot(2017-09)
`个人搭建学习SpringBoot、SpringCloud`


# MyBoot-eureka(2017-11-14)
云端服务发现，一个基于 REST 的服务，用于定位服务，以实现云端中间层服务发现和故障转移。
个人感觉相当于Dubbo-admin与zookeeper的集成。
http://localhost:1111/

~~~
当有很多微服务注册到 Eureka 时，如果有哪个服务坏掉了，我们希望是能够很直观的知道是哪个
服务出了问题，这样能更加快捷的定位问题。比如我们知道这是个认证服务，端口号是 8001，
那么如果我们直接显示 “认证服务-8101”，是不是更加直观呢？答案是肯定的，我们在
认证服务的配置文件中，通过 eureka.instance.instance-id 即可指定。
~~~

# MyBoot-provider(2017-11-15)

更换springBoot版本1.5.8.RELEASE

* 项目静态文件目录：/src/java/resources/static
* 项目模板文件目录：/src/java/resources/templates

spring-boot静态首页的支持，即index.html放在以下目录结构会直接映射到应用的根目录下：

~~~
classpath:/META-INF/resources/index.html
classpath:/resources/index.html
classpath:/static/index.html
calsspath:/public/index.html
~~~

mybatis ORM逆向生成实体 generatorConfig.xml

# MyBoot-zuul(2017-11-17)
服务代理，使用zuul过滤接口访问时，需去除provider中的WebSecurityConfig与pom中spring-boot-starter-security，不过建议在接口应用中不要添加
security，本环境provider因为是web中集成了provider故得进行修改。

~~~
访问http://127.0.0.1:5555/api/abc/city/01?accessToken=1233
其实代理到http://127.0.0.1:2222/sso/city/01地址
~~~

# MyBoot-parent(2018-03-28)
使用maven管控所有子项目引用版本

# MyBoot-hystrix(2018-04-02)
熔断器监控，调用测试搭建，具体调用后期补入
2018-04-09 加入swagger2用来构建api文档
swagger2默认访问地址：swagger-ui.html

http://127.0.0.1:8101/hystrix
调用熔断器仪表盘 查看接口熔断情况
http://localhost:8101/hystrix/monitor?stream=http://localhost:9000/hystrix.stream

# MyBoot-admin-server(2018-06-12)
Spring Boot Admin作为Server，其他 Spring Boot应用作为Client，Client把自身的信息“注册”到Server，
我们就能在Server上看到“注册”的Spring Boot应用的状态信息了。

# MyBoot-config(2018-11-28)
Spring Boot Admin配置管理工具包，让你可以把配置放到远程服务器，集中化管理集群配置，支持本地存储、Git以及SVN，
demo中为git配置。

# MyBoot-nacos(2019-01-11)
使用阿里nacos做服务注册中心，该版本使用0.7，暂时nacos不是很稳定不建议使用。

# MyBoot-oauth(2019-02-20)
* 集成redis做session管理
* 集成flyway做数据库版本管理
* 集成JPA做数据库ORM框架，实现多表关联查询

# MyBoot-consumer&MyBoot-ribbon(2019-06-26)
* 集成ribbon，学习实现负载均衡
* consumer启动多个，ribbon调用时轮询相关接口

## 各模块端口占用表

| 项目名                | 端口号 |
| --------------------- | ------ |
| admin-server          | 8080   |
| config                | 8089   |
| eureka                | 1111   |
| hystrix               | 8101   |
| oauth                 | 2222   |
| parent                | 8089   |
| provider              | 3333   |
| zuul                  | 5555   |
| nacos                 | 8003   |
| consumer              | 4444/4333 |
| ribbon                | 4332   |
|                       |        |
|                       |        |
|                       |        |
|                       |        |
--------