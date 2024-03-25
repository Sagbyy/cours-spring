package fr.sagby.pingpongtournamentbackend.tournament.rest;

import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentCreateRequestDTO;
import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentCreateResponseDTO;
import fr.sagby.pingpongtournamentbackend.tournament.service.TournamentService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tournaments")
@OpenAPIDefinition(
        // tags = { Tag("Tournament") }
)
public class TournamentRestController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping("/add")
    @Operation(summary = "Create a new (unique by name) tournament")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successful operation"),
        @ApiResponse(responseCode = "500", description = "name already used"),
    })
    public TournamentCreateResponseDTO create(@RequestBody TournamentCreateRequestDTO req) {
        return tournamentService.createTournament(req);
    }
}
