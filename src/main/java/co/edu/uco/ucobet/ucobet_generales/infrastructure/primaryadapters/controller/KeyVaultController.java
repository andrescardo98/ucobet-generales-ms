package co.edu.uco.ucobet.ucobet_generales.infrastructure.primaryadapters.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

@RestController
public class KeyVaultController {
	private final SecretClient secretClient;

	public KeyVaultController(SecretClient secretClient) {
		this.secretClient = secretClient;
	}

	@GetMapping("/getSecretValue/{key}")
	public String getSecretValue(@PathVariable("key") String key) {
		KeyVaultSecret secret = secretClient.getSecret(key);
		return secret.getValue();
	}

}