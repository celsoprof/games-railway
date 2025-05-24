package br.dev.celso.app_games.controller;

import br.dev.celso.app_games.model.Game;
import br.dev.celso.app_games.repository.GameRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {

    private GameRepository gameRepository = new GameRepository();

    @GetMapping("/games")
    public List<Game> games(){
        return gameRepository.findAll();
    }

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable int id){
        return gameRepository.findById(id);
    }

}
