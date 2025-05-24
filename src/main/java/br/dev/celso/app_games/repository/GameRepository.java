package br.dev.celso.app_games.repository;

import br.dev.celso.app_games.model.Game;

import java.util.List;

public class GameRepository {

    public List<Game> findAll() {
        return List.of(
                new Game(1, "Ikari Warriors", "Rare", 199.99),
                new Game(2, "Double Dragon", "Konamio", 199.99),
                new Game(3, "Batletoads", "Rare", 199.99),
                new Game(4, "Ninja Turtles", "Konami", 199.99),
                new Game(5, "Ninja Gaiden", "Capcom", 199.99)
        );
    }

    public Game findById(int id) {
        for (Game game : findAll()) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

}
