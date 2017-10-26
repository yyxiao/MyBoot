# MyBoot

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