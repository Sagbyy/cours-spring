package fr.sagby.pingpongtournamentbackend.tournament.service;

import fr.sagby.pingpongtournamentbackend.tournament.domain.Tournament;
import fr.sagby.pingpongtournamentbackend.tournament.repo.TournamentRepo;
import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentCreateRequestDTO;
import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentCreateResponseDTO;
import fr.sagby.pingpongtournamentbackend.tournament.rest.dto.TournamentGetAllResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class TournamentService {

    @Autowired
    private TournamentRepo tournamentRepo;

    public TournamentCreateResponseDTO createTournament(TournamentCreateRequestDTO req) {
        // step 1/3: unmarshall, check inputs
        String name = Objects.requireNonNull(req.name);
        if (name.length() < 3) {
            throw new IllegalArgumentException("name too short");
        }
        Tournament alreadyFound = tournamentRepo.findByName(name);
        if (alreadyFound != null) {
            throw new IllegalArgumentException("name already used");
        }

        // step 2/3: business code
        // OK, create
        Tournament entity = new Tournament();
        entity.name = name;
        entity.maxParticipants = req.maxParticipants;
        entity.startDate = req.startDate;
        entity = tournamentRepo.save(entity);

        // step 3/3: marshall output (DTO, not internal entity)
        TournamentCreateResponseDTO res = toDto(entity);
        return res;
    }

    public TournamentGetAllResponseDTO getAllTournaments() {
        return toDto(tournamentRepo.findAll());
    }

    private TournamentCreateResponseDTO toDto(Tournament src) {
        return new TournamentCreateResponseDTO(src.name, src.maxParticipants, src.startDate);
    }

    private TournamentGetAllResponseDTO toDto(List<Tournament> src) {
        return new TournamentGetAllResponseDTO(src);
    }
}
