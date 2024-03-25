package fr.sagby.pingpongtournamentbackend.repo;

import fr.sagby.pingpongtournamentbackend.domain.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TournamentRepo extends MongoRepository<Tournament, String> {
    Tournament findByName(String name);
}
