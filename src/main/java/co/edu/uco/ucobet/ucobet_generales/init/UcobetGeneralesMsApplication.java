package co.edu.uco.ucobet.ucobet_generales.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.azure.security.keyvault.secrets.SecretClient;

@SpringBootApplication
@EntityScan(basePackages = {"co.edu.uco.ucobet.ucobet_generales.application.secondaryports.entity" })
@ComponentScan(basePackages = { "co.edu.uco.ucobet" })
@EnableJpaRepositories(basePackages = {"co.edu.uco.ucobet.ucobet_generales.application.secondaryports.repository"})
public class UcobetGeneralesMsApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(UcobetGeneralesMsApplication.class, args);
	}

	//private final SecretClient secretClient;

	/*public UcobetGeneralesMsApplication(SecretClient secretClient) {
		super();
		this.secretClient = secretClient;
	}*/

	/*
	@Override
	public void run(String... args) throws Exception {
		String h2url = secretClient.getSecret("spring-datasource-url").getValue();
		System.setProperty("spring.datasource.url", h2url);
		System.out.println("h2url: " + h2url);
	}*/

}
