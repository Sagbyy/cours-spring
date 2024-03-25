package fr.sagby.pingpongtournamentbackend.rest.tournament;

import fr.sagby.pingpongtournamentbackend.rest.tournament.dto.TournamentCreateRequestDTO;
import fr.sagby.pingpongtournamentbackend.rest.tournament.dto.TournamentCreateResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentRestController {

    @PostMapping("/add")
    public TournamentCreateResponseDTO create(@RequestBody TournamentCreateRequestDTO req) {
        TournamentCreateResponseDTO res = new TournamentCreateResponseDTO();

        // On ajoute les attributs manquants dans la réponse
        res.name = req.name;
        res.maxParticipants = req.maxParticipants;
        res.startDate = req.startDate;

        return res;
    }
}
