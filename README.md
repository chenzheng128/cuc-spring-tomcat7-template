### usage
cp project.samples .project 
import into eclipse project 
run with tomcat 7 (!!! Don't support tomcat 8 !!!)

visit localhost:8080/<appname>/ for json
visit localhost:8080/<appname>/hello.jsp for jsp pages


### update
5. add .setting.zip file (eclipse facet) to external tomcat 7.0 server
  unzip .setting 
  add path to tomcat context
  tomcat start
  visit http://localhost:8080/cuc-spring-tomcat7-template/people

4. add eclipse JPA facet support 

3. add jsp page support  
  WebContent/hello.jsp 

2. add StudentReposity REST style 

1. add src/resource/application.propertis
  using hibernate connect mysql server (localhost)

