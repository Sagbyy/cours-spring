package fr.sagby.pingpongtournamentbackend.tournament.rest.dto;

import fr.sagby.pingpongtournamentbackend.tournament.domain.Tournament;

import java.util.List;

public class TournamentGetAllResponseDTO {
    public List<Tournament> tournamentList;

    public TournamentGetAllResponseDTO(List<Tournament> tournaments) {
        this.tournamentList = tournaments;
    }
}
