package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@EnableEurekaClient
public class OrderApiServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApiServiceApplication.class, args);
    }
}