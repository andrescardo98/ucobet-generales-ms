package co.edu.uco.ucobet.ucobet_generales.infrastructure;

import org.springframework.stereotype.Service;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;

@Service
public class KeyVaultService {
	private final SecretClient secretClient;
	
	public KeyVaultService() {
		this.secretClient = new SecretClientBuilder().
				vaultUrl("https://keyvaultucobet.vault.azure.net/").
				credential(new DefaultAzureCredentialBuilder().build()).
				buildClient();
	}
	
	public String getSecret(String secretName) {
		return secretClient.getSecret(secretName).getValue();
	}

}
