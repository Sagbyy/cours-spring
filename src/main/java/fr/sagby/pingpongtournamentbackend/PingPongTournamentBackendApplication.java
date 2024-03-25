package fr.sagby.pingpongtournamentbackend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Tournament App API", version = "1.0",
				description = "Rest API using OpenAPI 3 for a tutorial Tournament application"))
public class PingPongTournamentBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingPongTournamentBackendApplication.class, args);
    }

}
