package fr.sagby.pingpongtournamentbackend.tournament.rest.dto;

import java.time.LocalDate;

public class TournamentCreateRequestDTO {
    public String name;
    public int maxParticipants;
    public LocalDate startDate;
}
