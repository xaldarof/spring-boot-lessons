package uz.xaldarof.lessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class
})
@EnableJpaRepositories(basePackages = "uz.xaldarof.lessons.repositories")
public class LessonsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LessonsApplication.class,args);
	}

}
