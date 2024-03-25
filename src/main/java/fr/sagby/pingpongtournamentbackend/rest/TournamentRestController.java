package fr.sagby.pingpongtournamentbackend.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentRestController {

    @PostMapping
    public TournamentCreateResponseDTO create(@RequestBody TournamentCreateRequestDTO req) {
        TournamentCreateResponseDTO res = new TournamentCreateResponseDTO();
        res.name = req.name;

        return res;
    }
}
