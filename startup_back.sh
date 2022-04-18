# Application build
mvn clean install

# Start application back
echo "RUN TENPO APP(BACK)"
java -jar target/crudTransaction-0.0.1-SNAPSHOT.jar
