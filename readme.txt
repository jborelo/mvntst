mvn archetype:generate  -DgroupId=unv.jbo -DartifactId=mvntst2 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


-------------------------------
jar executable:
http://www.avajava.com/tutorials/lessons/how-do-i-specify-a-main-class-in-the-manifest-of-my-generated-jar-file.html

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>unv.jbo</groupId>
  <artifactId>mvntst2</artifactId>
  <packaging>jar</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>mvntst2</name>
  <url>http://maven.apache.org</url>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

<build>
	<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-jar-plugin</artifactId>
				<configuration>
					<archive>
						<manifest>
							<mainClass>unv.jbo.App</mainClass>
						</manifest>
					</archive>
				</configuration>
			</plugin>
		</plugins>
	</build>

</project>


