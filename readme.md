#Categorize Numbers Application

##To run this application, follow the steps below:

STEP 1
mvn clean package

STEP 2
docker build --tag=categorizenumbers:latest .

STEP 3
docker run -p 8080:8080 categorizenumbers:latest

