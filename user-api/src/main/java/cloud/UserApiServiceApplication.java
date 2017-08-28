package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@EnableEurekaClient
@ResponseBody
public class UserApiServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApiServiceApplication.class, args);
    }
}
