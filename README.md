# HW2

## Part 1 - Java Frameworks
In this section, I will breifly explain some of the Java frameworks and their use. Let's begin.

<b>Spring</b><br>
Spring is a light-weight and open-source Java framework which can be used to build or create any type of Java project, especially enterprise-level web applications. Also, Spring has enormous features like compatibility with XML configurations, JDBC (Java Database Connectivity / API ) connections, Spring security and so on. I think that most important feature of Spring is Dependency Injection (DI). Therefore, I will show usage of Spring framework on Dependency Injection. <u>Dependency Injection</u> is a pattern which allows developers to create decoupled structures. Thanks to DI, we can easily build loosely coupled components which is amazing for reusability, readibility and scalibility. Here is an example:

Suppose we have <b>Product</b> class and <b>ProductService</b> interface for its applications. Also we have <b>ProductManager</b> class which implements <b>ProductService</b> interface and <b>ProductRepository</b> interface for CRUD operations. 
```java
public class ProductManager implements ProductService {
    private ProductRepository productRepository;
    
    @Autowired
    public ProductManager(ProductRepository productRepository){
        super();
        this.productRepository = productRepository;
    }
}
```
As you can see, there is a keyword <b>Autowired</b> just before constructor. Autowired is a feature of Spring that looks for class or interface that can be instance of <b>ProductRepository</b>. If there is no such a class or interface, Spring creates a new instance for <b>ProductRepository</b>. 

<b>Hibernate</b><br>
Hibernate is a light-weight and open-source Java framework which can be used to interact with the relational database. Also, hibernate implements the specifications of JPA (Java Persistance API) for data persistance. There are lots of keywords coming up with <b>JPA</b>.
As I mentioned before, Hibernate implements JPA specifications, so, we can use JPA's keywords in our application. Here is an example:

```java
import javax.persistence.*;

@Entity
@Table(name="products")
public class Product{

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Category category;
    private String productName;
    private double productPrice;
}
```
@Entity and @Table annotations map this model with its table in the database. @Id, @Column and @GeneratedValue annotations tell Hibernate which field is ID, ID column is auto-increment and what column name is of this field. Thanks to Hibernate for implementing JPA specifications, we can do all this stuff with writing just one annotation.

<b>JavaServer Faces (JSF)</b><br>
JSF is a server side user interface (UI) framework. It is used for developing component based web applications by taking into consideration MVC (Model-View-Controller) architecture. The JSF API provides components and helps to manage their states. Some of JSF components : 
- inputText
- outputText
- form
- inputHidden etc.

You can find the usage of JSF for UI below.

```xhtml
<?xml version='1.0' encoding='UTF-8' ?>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">  
<html xmlns="http://www.w3.org/1999/xhtml"  
xmlns:h="http://xmlns.jcp.org/jsf/html">  
    <h:head>  
    <title>User Form</title>  
    </h:head>  
    <h:body>  
        <h:form>  
            <h:outputLabel for="username">User Name<h:outputLabel>  
            <h:inputText id="username" value="#{user.name}" required="true" requiredMessage="User Name is required" /><br/>
            <h:commandButton id="submit-button" value="Submit" action="response.xhtml"/>  
        </h:form>  
    </h:body>  
</html> 
```
h:head, h:body, h:form, h:outputLabel, h:inputText etc. comes from <b>JSF Framework</b>. We can liken this framework to React or Vue for its usage area.



## Part 2 - Common Design Patterns in the Spring Framework
In this section, I will breifly explain some of the common design patterns (DP) used in Spring.
- <u>MVC DP :</u> MVC Design Pattern is a design that divides system or subsystem into three layer which are **M**odel, **V**iew, **C**ontroller. 
- <u>Singleton DP :</u> Singleton pattern is a pattern that ensures only one instance of an object exist. 
- <u>Factory Method DP : </u> Factory Method DP is a design pattern says a factory class with an abstract method for creating ojects.
- <u>Proxy Pattern :</u> Proxy pattern is a technique that allows one object to control access to another object. 
- <u>Template Method DP :</u> The template method pattern is a technique that defines the steps required for some action, implementing the boilerplate steps, and leaving the customizable steps as abstract
## Part 3 - Creational Design Patterns
Creational Design Patterns are design patterns which handle object creation. It is used when a decision must be made at the time of instantiation of a class for making code flexible. It has six type:
- Factory Method Pattern
- Abstract Factory Pattern
- Singleton Pattern
- Prototype Pattern
- Builder Pattern 
- Object Pool Pattern

**Changing previous homework from Singleton to Factory Method Pattern**
Since classes of my previous project have attribute, I could not change the design pattern into Factory method. So, I added a new feature in this application named with **Notification**.
- This interface print out a notification when a property was created. 
- I added Notification Interface.
- I added House Notification class and Land Notification class.
- I added Notification Factory class. 

**Here are the details;**

Notification.java
```java
public interface Notification {
    void sendNotification();
}
```

HouseNotification.Java
```java
public class HouseNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("House is created.. (Notification Factory)");
    }
}

```
LandNotification.Java
```java
public class LandNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Land is created.. (Notification Factory)");
    }
}
```

Hepsiemlak.java (code snippet)
```java
NotificationFactory notificationFactory = new NotificationFactory();
Notification notification;

Property house1 = new House("Apartman Dairesi",3,1,2,"Kombi",25,5,"Satilik",address1,150);
notification = NotificationFactory.createNotification(house1);
notification.sendNotification();
```

## References
- https://en.wikipedia.org/wiki/Creational_pattern
- https://www.baeldung.com/spring-framework-design-patterns
- https://www.javatpoint.com/what-is-jsf
- https://www.javatpoint.com/steps-to-create-first-hibernate-application