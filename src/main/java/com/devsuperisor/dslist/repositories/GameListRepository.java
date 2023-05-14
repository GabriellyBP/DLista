package com.devsuperisor.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperisor.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

