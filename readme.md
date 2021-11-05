<h1>Categorize Numbers Application</h1>

<p>This project implements a basic business logic related to the validation of international telephone numbers.</p>

<h3>Technologies Used</h3>

<ul>
  <li>Springboot 4.0.0 for Back-End</li>
  <li>Lombok</li>
  <li>Thymeleaf, Bootstrap and Datatables for Front-End</li>
  <li>SQL Lite and JPA for Database</li>
  <li>JUnit and MockMvc for Tests</li>
  <li>Docker for Containerization</li>
 </ul>

<h3>To run this application, follow the steps below</h3>

<ol>
  <li>mvn clean package</li>
  <li>docker build --tag=categorizenumbers:latest .</li>
  <li>docker run -p 8080:8080 categorizenumbers:latest</li>
 </ol>


