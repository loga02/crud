**Project work flow:**
1.Repository Layer:
            Repository layer is responsible for handling the communication between service layer and database.
            Here,this layer will be an interface.
            Hence there is no need of hard coding.
            We have to extend JpaRepository<entityName,PrimaryKeyDataType>
              eg:public interface myRepository extends JpaRepository<Student,Integer>
            This layer should be annotated with @Repository.
2.Service Layer:
            In the service layer, we have service Layer interface and service layer implementation.
            In the service layer interface,we will be defining the method.
            In the serviceLayer implementation, we are implementing the method that has been defined.
            ServiceLayer should be annotated with @Service
3.Controller Layer:
            Here we have are using @RestController.
            It is a combination of @Controller layer and @RequestBody.
            It should be annotated with @RestController.
        In the application.properties file,you need to include username and password:
        

spring.datasource.url=jdbc:mysql://localhost:3306/practise?useSSL=false
spring.datasource.username=//you have to include your username
spring.datasource.password=//you have to include your password

spring.jpa.hibernate.ddl-auto=update

spring.jpa.generate-sql=true

I have done basic operations such as
      1.Creating a student
      2.Getting list of student
      3.Getting a student of particular id
      4.Deleting a student
      5.Updating the fields of student
      
