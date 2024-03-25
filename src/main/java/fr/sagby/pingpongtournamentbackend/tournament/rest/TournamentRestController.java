package fr.sagby.pingpongtournamentbackend.tournament.rest;

import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentCreateRequestDTO;
import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentCreateResponseDTO;
import fr.sagby.pingpongtournamentbackend.tournament.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentRestController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping("/add")
    public TournamentCreateResponseDTO create(@RequestBody TournamentCreateRequestDTO req) {
        return tournamentService.createTournament(req);
    }
}
