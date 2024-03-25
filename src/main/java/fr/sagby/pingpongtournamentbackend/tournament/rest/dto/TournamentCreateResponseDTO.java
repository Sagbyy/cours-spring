package fr.sagby.pingpongtournamentbackend.tournament.rest.dto;

import java.time.LocalDate;

public class TournamentCreateResponseDTO {
    public String name;
    public int maxParticipants;
    public LocalDate startDate;

    public TournamentCreateResponseDTO() {}

    public TournamentCreateResponseDTO(String name, int maxParticipants, LocalDate startDate) {
        this.name = name;
        this.maxParticipants = maxParticipants;
        this.startDate = startDate;
    }
}


