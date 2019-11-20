FROM jboss/wildfly
ADD SpringBootApp.war /opt/jboss/wildfly/standalone/deployments/
EXPOSE 8080
