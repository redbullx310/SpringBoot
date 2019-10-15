FROM centos:latest
RUN yum -y update

# Install java
RUN yum -y install java
RUN echo $(java -version)

#Create tomcat user
RUN useradd -m -U -d /opt/tomcat -s /bin/false tomcat

# Install tomcat
WORKDIR /tmp
RUN curl -O https://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.27/bin/apache-tomcat-9.0.27.tar.gz
RUN tar xvfz apache-tomcat*
RUN mv apache-tomcat*/* /opt/tomcat
RUN chown -R tomcat: /opt/tomcat

# Copy the war file to tomcat hosting directory
COPY SpringBootApp.war /opt/tomcat/webapps/

# Tomcat listens on port 8080
EXPOSE 8080

# Start tomcat
CMD ["/opt/tomcat/bin/catalina.sh", "run"]