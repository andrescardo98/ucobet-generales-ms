package co.edu.uco.ucobet.ucobet_generales.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.azure.security.keyvault.secrets.SecretClient;

@SpringBootApplication
@ComponentScan(basePackages = { "co.edu.uco.ucobet" })
public class UcobetGeneralesMsApplication implements CommandLineRunner{
	
	private final SecretClient secretClient;

	public UcobetGeneralesMsApplication(SecretClient secretClient) {
		super();
		this.secretClient = secretClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(UcobetGeneralesMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String h2url = secretClient.getSecret("spring-datasource-url").getValue();
		System.setProperty("spring.datasource.url", h2url);
		System.out.println("h2url: " + h2url);
	}

}
