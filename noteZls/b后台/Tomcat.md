## [mac下tomcat的安装与配置](https://www.cnblogs.com/freeyiyi1993/p/3436368.html)

##### 1、到 [apache官方主页](http://tomcat.apache.org/) 下载 Mac 版本的完整 tar.gz文件包。解压拷贝到 /Library目录下,并命名为Tomcat，其他目录也可。

2、修改目录权限 

​	到终端输入 sudo chmod 755 /Library/Tomcat/bin/*.sh 

​	(方便其他用户使用 tomcat)

3、启动Tomcat

按回车键之后会提示输入密码，请输入管理员密码。之后输入并回车： 
sudo sh startup.sh 
若出现如下提示则表示安装并运行成功： 
Using CATALINA_BASE: /Library/Tomcat 
Using CATALINA_HOME: /Library/Tomcat 
Using CATALINA_TMPDIR: /Library/Tomcat/temp 
Using JRE_HOME: /System/Library/Frameworks/JavaVM.framework/Versions/CurrentJDK/Home 

4、 打开浏览器，输入 http://localhost:8080/ 
回车之后如果看到Apache Tomcat，表示已经成功运行Tomcat 

5、配置**Tomcat**启动脚本：

使用文本编辑器添加以下代码：

\#!/bin/bash

case $1 in
start)
sh /Library/Tomcat/bin/startup.sh
;;
stop)
sh /Library/Tomcat/bin/shutdown.sh
;;
restart)
sh /Library/Tomcat/bin/shutdown.sh
sh /Library/Tomcat/bin/startup.sh
;;
*)
echo “Usage: start|stop|restart”
;;
esac

exit 0

将文件保存为tomcat，小写并不带后缀。赋予文件执行权限：

chmod 777 tomcat

。将这个文件放置到终端包含的路径中，例如/usr/bin，而后便可以在终端中简单地输入tomcat start和tomcat stop启用tomcat了。

快捷命令如下：

1）tomcat start 

2)  tomcat stop

3)  tomcat restart 