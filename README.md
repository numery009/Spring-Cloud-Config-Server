# Spring-Cloud-Config-Server
This is a tamplate of the Spring Cloud Config Server. Following steps you need to do to create and deploy the application--

1) Create a General Project name as rsmortgage-config-repository
2) Create a folder rsmortgage-customer-servicein the project.
3) Then add the follwoing 3 files in the folder-
     a) rsmortgage-customer-service-mysql-dev.yml
     b) rsmortgage-customer-service-mysql-prod.yml
     c) rsmortgage-customer-service-mysql.yml
     
     
4) Create a git-hub repository on the name :  rsmortgage-config-repository
5) Push the project rsmortgage-config-repository to git-hub repo : https://github.com/numery009/rsmortgage-config-repository
6) Then go inside the target folder of this project. Open a terminal. 
7) Run the following command--java -jar spring-cloud-config-server-0.0.1-SNAPSHOT.jar
8) Spring-Cloud-Config server is up and running om Port:9000.
9) To validate it please run the folowing URL in the browser-
   a) http://localhost:9000/rsmortgage-customer-service-mysql-prod/default
   b) http://localhost:9000/rsmortgage-customer-service-mysql-dev/default
   c) http://localhost:9000/rsmortgage-customer-service-mysql/default
   
   You can view the Prod, Dev and Default enviroment properties of you application in the browser. 
    
To change the properties-- 
 1) Change in the properties in you project. 
 2) Commit and Pust it in the Gir-Hub repository. 
 3) Spring Cloud Config Server will take the update from the Git-Hub repository and make it available for the dedicated app. 

