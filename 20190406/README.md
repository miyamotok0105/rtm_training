
# 1.javaの写経大会

本を元にみんなでリレー形式でjava写経    


# 2.tomcatでjspを設定(mac版)

brewでtomcatを入れる    

```
brew install tomcat7
/usr/local/Cellar/tomcat\@7/7.0.93/bin/catalina start
```

http://localhost:8080/

フォルダ構造を作る    

```
cd /usr/local/Cellar/tomcat\@7/7.0.93/libexec/webapps
mkdir test
mkdir test/WEB-INF
mkdir test/WEB-INF/classes
cd /usr/local/Cellar/tomcat@7/7.0.93/libexec/webapps
mkdir src
touch HelloWorld.java
```

HelloWorld.javaをビルド    

javac -classpath "/usr/local/Cellar/tomcat@7/7.0.93/libexec/lib/servlet-api.jar" HelloWorld.java

設置

```
mv HelloWorld.class ../test/WEB-INF/classes
cd /usr/local/Cellar/tomcat@7/7.0.93/libexec/webapps/test/WEB-INF
touch web.xml
```


```:web.xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<web-app xmlns="http://java.sun.com/xml/ns/j2ee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
         http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd"
         version="2.4">

  <servlet>
    <servlet-name>HelloWorldName</servlet-name>
    <servlet-class>HelloWorld</servlet-class>
  </servlet>
  
  <servlet-mapping>
    <servlet-name>HelloWorldName</servlet-name>
    <url-pattern>/HelloWorldPage</url-pattern>
  </servlet-mapping>

</web-app>
```


動いてるか確認    

http://localhost:8080/test/HelloWorldPage


# 参考

http://satoukibi.hatenablog.com/entry/2017/02/24/Tomcat_-Servlet%E3%81%A7HelloWorld%E3%81%97%E3%81%A6%E3%81%BF%E3%82%8B%28Mac%29

http://satoukibi.hatenablog.com/entry/2017/02/23/165338

https://pleiades.io/help/idea/creating-and-running-your-first-java-ee-application.html#0e84a2e1
    