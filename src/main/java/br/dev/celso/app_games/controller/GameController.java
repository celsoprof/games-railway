package br.dev.celso.app_games.controller;

import br.dev.celso.app_games.model.Game;
import br.dev.celso.app_games.repository.GameRepositoryTest;
import br.dev.celso.app_games.service.GameService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {

    private GameRepositoryTest gameRepository = new GameRepositoryTest();

    @Autowired
    private GameService gameService;

    @GetMapping("/games")
    public List<Game> games(){
        return gameService.findAllGames();
    }

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable Long id){
        return gameService.findGameById(id);
    }

    @PostMapping("/games")
    public Game saveGame(@RequestBody Game game){
        return gameService.createGame(game);
    }

}
