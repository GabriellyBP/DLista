package com.devsuperisor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperisor.dslist.entities.Game;

public interface GameRespository extends JpaRepository<Game, Long>{

}
