package br.dev.celso.app_games.service;

import br.dev.celso.app_games.model.Game;
import br.dev.celso.app_games.repository.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRespository gameRespository;

    public Game findGameById(Long id) {
        Optional<Game> game = gameRespository.findById(id);
        return game.orElse(null);
    }

    public List<Game> findAllGames() {
        return gameRespository.findAll();
    }

    public Game createGame(Game game) {
        return gameRespository.save(game);
    }

}
