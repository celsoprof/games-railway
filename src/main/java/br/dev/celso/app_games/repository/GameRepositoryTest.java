package br.dev.celso.app_games.repository;

import br.dev.celso.app_games.model.Game;

import java.util.List;

public class GameRepositoryTest {

    public List<Game> findAll() {
        return List.of(
                new Game(1L, "Ikari Warriors", "Rare", 199.99, ""),
                new Game(2L, "Double Dragon", "Konamio", 199.99, ""),
                new Game(3L, "Batletoads", "Rare", 199.99, ""),
                new Game(4L, "Ninja Turtles", "Konami", 199.99, ""),
                new Game(5L, "Ninja Gaiden", "Capcom", 199.99, "")
        );
    }

    public Game findById(Long id) {
        for (Game game : findAll()) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

}
