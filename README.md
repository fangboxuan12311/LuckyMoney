# LuckyMoney
Springboot一些基础操作，包括注释、数据库的配置、配置文件，也有涉及到模板渲染
可供新手学习使用
项目内容很基础，主要是数据库的增删改查
说明如下：
①Springboot版本：2.1.3
②依赖：  spring-boot-starter-web  spring-boot-starter-data-jpa
         mysql-connector-java
③被@PostMapping("XXXX")所注释的路径，要用Postman软件进行访问，浏览器无法访问。
③数据库的配置为update，在编译时会显示SQL语句
④数据库的增删改查  LuckymoneyController
⑤数据库事务 LuckymoneyService
⑥表 Luckymoney
⑦LuckmoneyApplication 启动类
⑧数据库接口 LuckymoneyRepository 
⑨端口 8081 
