package fr.sagby.pingpongtournamentbackend.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tournament {

    @Id
    public String id;

    public String name;
    public int maxParticipants;
    public String startDate;
}
