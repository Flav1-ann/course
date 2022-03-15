package eu.ensup.client_project.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("eu.ensup.client_project.domaine")
@EnableJpaRepositories("eu.ensup.client_project.repository")
@EnableTransactionManagement
public class DomainConfig {
}
