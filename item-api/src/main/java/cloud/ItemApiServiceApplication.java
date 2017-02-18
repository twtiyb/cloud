package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
//@EnableEurekaClient
public class ItemApiServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemApiServiceApplication.class, args);
    }
}
