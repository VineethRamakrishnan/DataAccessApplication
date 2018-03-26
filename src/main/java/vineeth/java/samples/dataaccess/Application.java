package vineeth.java.samples.dataaccess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Basic Data access application with mysql database
 *
 */

/**
 * This Annotation is referred from spring-boot-starter-web dependency
 * @author v.rama.krishnan
 *
 */

@SpringBootApplication
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);
    }
}