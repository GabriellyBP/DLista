package com.devsuperisor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperisor.dslist.dto.GameDTO;
import com.devsuperisor.dslist.dto.GameMinDTO;
import com.devsuperisor.dslist.entities.Game;
import com.devsuperisor.dslist.repositories.GameRespository;


@Service
public class GameService {
	
 @Autowired 
 private GameRespository gameRepository;

 @Transactional(readOnly = true)
 public GameDTO findById(Long id) {
	 Game result = gameRepository.findById(id).get();
	 return new GameDTO(result); 
 }
 
 @Transactional(readOnly = true)
 public List<GameMinDTO> findAll() {
	 List<Game> result = gameRepository.findAll();
	 return result.stream().map(x -> new GameMinDTO(x)).toList();
 }
}
