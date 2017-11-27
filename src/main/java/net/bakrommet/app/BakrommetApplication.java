package net.bakrommet.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableAutoConfiguration
@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource(value = "classpath:auth0.properties", ignoreResourceNotFound = true)
})
public class BakrommetApplication {

	public static void main(String[] args) {
		SpringApplication.run(BakrommetApplication.class, args);
	}
}
