package fr.sagby.pingpongtournamentbackend.tournament.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document
public class Tournament {

    @Id
    public String id;

    public String name;
    public int maxParticipants;
    public LocalDate startDate;
}
