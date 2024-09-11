Order Processing System
Overview
The Order Processing System is a simple Java-based application that handles the ordering process for items such as laptops and mobile phones. It uses Spring IoC (Inversion of Control) for dependency injection to manage the relationships between components like OrderService and PaymentService.

Features
Item-based pricing: Prices are dynamically set based on the item being ordered (e.g., Laptop, Mobile).
Payment integration: PaymentService is integrated to handle payments for the orders.
Modular design: Uses Spring's Dependency Injection to make the application loosely coupled and more maintainable.
Technologies Used
Java: Core programming language for business logic.
Spring Framework: Used for Dependency Injection (IoC).
XML-based configuration: Spring beans are configured via XML.
Maven: For project management and dependency management.
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/Suraj9161/Order_Processing_System.git
Navigate to the project directory:

bash
Copy code
cd order-processing-system
Build the project using Maven:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
java -jar target/order-processing-system.jar
Usage
Open the project in your preferred IDE (e.g., Eclipse, IntelliJ IDEA).
Modify the spring-config.xml if needed, to add more services or change dependencies.
Run the App.java file to start the application.
The system will process orders for items like laptops and mobile phones, and automatically handle payments based on the predefined prices.
How It Works
OrderService processes orders based on the item name.
PaymentService handles payment transactions based on the item price.
Both services are injected using Spring's IoC container.
Example Output:
bash
Copy code
Processing order for: Laptop
Payment of $1000.0 processed successfully.

Processing order for: Mobile
Payment of $500.0 processed successfully.
Project Structure
css
Copy code
src/
 └── main/
      ├── java/
      │     └── in/springIoC/
      │           ├── App.java
      │           ├── beans/
      │           │     ├── OrderServiceImpl.java
      │           │     ├── PaymentServiceImpl.java
      │           └── interfaces/
      │                 ├── OrderService.java
      │                 ├── PaymentService.java
      └── resources/
            └── spring-config.xml
Contributing
Feel free to fork this repository and submit pull requests. For significant changes, please open an issue first to discuss what you would like to change.

License
This project is licensed under the MIT License - see the LICENSE file for details.
