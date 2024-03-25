package fr.sagby.pingpongtournamentbackend.rest;

import java.time.LocalDate;

public class TournamentCreateResponseDTO {

    public String id;

    public String name;
    public int maxParticipants;
    public LocalDate startDate;
}
