package fr.sagby.pingpongtournamentbackend.rest;

import java.time.LocalDate;

public class TournamentCreateRequestDTO {
    public String name;
    public int maxParticipants;
    public LocalDate startDate;
}
