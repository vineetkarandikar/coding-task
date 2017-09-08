Introduction:This application is responsible for calculation task.

Build the application from source: mvn clean install

Deploy the application:mvn spring-boot:run

URL for Swagger:http://localhost:8080/codingtask/swagger-ui.html#/

For Docker
In the project folder their is docker file.Use the same to build the image.
after that run the following commands.

sudo docker build -t innovation .

sudo docker run -p 8080:8080 -t -i innovation mvn spring-boot:run -f coding-task/pom.xml