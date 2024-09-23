# Project-Kitchen-Story-Backend

## Project Documentation

### Project Information
- **Project Name**: Kitchen Story Website  
- **Developer**: Rahul Rana  
- **GitHub Account**: [Rahulpersie66](https://github.com/Rahulpersie66)  
- **GitHub Repository Links**:  
  - [Frontend of Kitchen Story](https://github.com/Rahulpersie66/project-4-Kitchen_Story)  
  - [Backend of Kitchen Story](https://github.com/Rahulpersie66/Project-Kitchen-Story-Backend/tree/master/kitchen-story)  

### Tools & Technologies
- **IDE**: Eclipse IDE (Backend), Visual Studio (Frontend)
- **Frontend**: Angular
- **Backend**: Spring Boot
- **Tool**: Maven (for dependency management)
- **Plugins**: Maven Compiler Plugin, Maven WAR Plugin  
- **Database**: MySQL  
  - **Database Name**: `fun`
  - **Tables**: `Kitchen_User_Registered`, `Kitchen_Product`, `Kitchen_Order_Booked`
- **Programming Languages**: Java, TypeScript, HTML, CSS, MySQL, Bootstrap
- **Server**: Spring Boot Embedded Server
- **Bootstrap**: Added via CDN

### Output of the Project
- Can be viewed on any browser by running the Angular frontend.

### MySQL Configuration
- MySQL connection is configured in the `application.properties` file in the Eclipse IDE.

---

## Project Setup and Process

### Data Flow Diagram
<!-- You can insert an image or diagram here if applicable -->

### Algorithm
1. **Create a Spring Boot Project**:  
   Use the Spring Starter Project from `spring.io` to generate the project structure.
   
2. **Add Dependencies**:  
   Add the required dependencies (MySQL connector, Spring Boot Starter JPA, DevTools) in the `pom.xml`.

3. **Configure Database**:  
   Update the `application.properties` file with MySQL database configurations.

4. **Define Packages**:  
   - `entities` for database table structures.
   - `daos` for CRUD operations (using JPA Repositories).
   - `services` for service interfaces.
   - `serviceImpls` for service implementations.
   - `controllers` for mapping services to URLs.

5. **Entity Definitions**:  
   Define all tables using `@Entity` and `@Table(name)` annotations, and specify primary keys using `@Id`.

6. **Repositories**:  
   Create a JPA repository for each table to handle basic CRUD operations. Mark these classes with `@Repository`.

7. **Service Interfaces**:  
   Define services needed by both the controller and admin, using interfaces.

8. **Service Implementations**:  
   Implement the service interfaces in `serviceImpl` classes, marking them as `@Service`.

9. **Controller**:  
   Define controller logic in the `@RestController` class, mapping URLs to services.

10. **Run Backend**:  
    The Spring Boot application will run on `localhost:8080`.

11. **Create Angular Frontend**:  
    Build the Angular frontend by running `ng new KitchenStory`, and configure services to interact with the backend.

12. **Add Bootstrap**:  
    Add Bootstrap using CDN links in the `index.html` file.

13. **Cross-Origin Setup**:  
    Use `@CrossOrigin("*")` in the Spring Boot controller to allow Angular to interact with the backend.

14. **Run Angular Frontend**:  
    Run the Angular project on `localhost:4200` using `ng serve -o`.

---

## Sprint Planning and Development

### Sprint 1
- **Objective**: Complete the backend by defining database tables, repositories, services, and controllers.
- **Tasks**:
  - Define MySQL tables with `@Entity`.
  - Create JPA Repositories for each table.
  - Implement services and controllers for handling user and product data.

### Sprint 2
- **Objective**: Build the Angular frontend.
- **Tasks**:
  - Add Bootstrap to the `index.html`.
  - Create models, services, and components in Angular.
  - Implement search functionality with a pipe filter in the navbar.

### Sprint 3
- **Objective**: Integrate search functionality in the navbar and finalize the frontend.
- **Tasks**:
  - Create a search pipe to filter results based on user input.
  - Finalize the frontend design and functionality.

---

## Project Features
- **Admin Panel**:  
  Admins can manage products, view user information, and update product details.
  
- **User Features**:  
  Users can sign up, log in, view products, add items to the cart, and book orders.

---

## Future Enhancements
- Deployment of the project on an IP address (AWS or Heroku).
- Add a carousel for product images.
- Implement a real payment gateway (currently a dummy setup).
- Integration with a delivery partner.

---

## Conclusion
This Spring Boot + Angular project builds a fully functional e-commerce platform where users can browse and purchase items, and the admin can manage products and users. The project can be further enhanced by adding features like a real payment gateway and deployment on cloud services.

---

## Unique Selling Points
- Easy to use for both users and admins.
- Similar functionality to popular e-commerce platforms like Amazon and Flipkart.
- Real-time management of products and orders.
