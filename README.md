guice-netty-bootstrap
=====================

Guice 3 and Netty 4 Sample Project

Dependencies included
---------------------
- Guice 3.0
- Guava (Latest release)
- Netty 4.0.23.Final
- JUnit 4.10

Requirements
------------
- Java 7
- Maven 3

Configuring Hostname and Port
-----------------------------
- Open <code>pom.xml</code> file and modify the <code>netty.hostname</code> and <code>netty.port</code> properties
- Default values are <code>localhost:8080</code>

Running with Maven
------------------
- Run the Application with <code>mvn exec:java </code>

Connect to Server
-----------------
- Run <code>telnet localhost 8080</code>
- To stop the server press <code>Ctrl + C</code> on the Server Terminal and any Client will drop.

Generate Maven Archetype from Project
-------------------------------------
 - Work In progress