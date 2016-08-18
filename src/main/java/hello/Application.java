package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by deb on 18/8/16.
 */
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
