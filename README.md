# my-banking-app: The example of accessing remote EJB from other JVM

#Deployment: make sure the JBoss EAP 6.4 is running
mvn clean install jbass-as:deploy

#Remote EJB call: before please make sure the TestService is successfully deployed
Run in IDE (Eclpise) the following test: ejb-client\src\main\java\my\test\app\RemoteEJBClient.java

After running the test log "Hello RemoteEJB" must appear in the console of JBoss EAP 6.4 