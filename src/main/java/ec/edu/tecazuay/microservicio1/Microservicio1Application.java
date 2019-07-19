package ec.edu.tecazuay.microservicio1;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaAuditing
public class Microservicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservicio1Application.class, args);
	}
       
}
