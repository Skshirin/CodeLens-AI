package codeLens.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

@Configuration
public class CryptoConfig {

    @Bean
    public TextEncryptor textEncryptor(
            @Value("${app.token-encryptor-password:devpilot-local-encrypt-key-change-me}") String password,
            @Value("${app.token-encryptor-salt:deadbeefcafebabe}") String salt) {
        return Encryptors.text(password, salt);
    }
}