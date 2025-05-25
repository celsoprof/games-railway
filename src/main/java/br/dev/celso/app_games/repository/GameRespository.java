package br.dev.celso.app_games.repository;

import br.dev.celso.app_games.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRespository extends JpaRepository<Game, Long> {
}
