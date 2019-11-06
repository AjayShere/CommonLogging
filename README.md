# CommonLogging


Mkae sure the Project in which we are usin this depedency the application class has
@ComponentScan(basePackages = "com.*")
public class SpringBootHelloWorldApplication {
}

so that i can find the LOgger file

And depencey  scope will be runime

<dependency>
			<groupId>com.commonLogging</groupId>
			<artifactId>commonLogging</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<scope>runtime</scope>
		</dependency>
