package job4j_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("job4j_auth.model")
@EnableJpaRepositories("job4j_auth.repository")
@ComponentScan({"job4j_auth.service", "job4j_auth.controller"})
public class Job4jAuthApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Job4jAuthApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(Job4jAuthApplication.class, args);
	}

}
