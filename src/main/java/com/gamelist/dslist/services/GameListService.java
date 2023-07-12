package com.gamelist.dslist.services;

import com.gamelist.dslist.dto.GameDTO;
import com.gamelist.dslist.dto.GameListDTO;
import com.gamelist.dslist.dto.GameMinDTO;
import com.gamelist.dslist.entities.Game;
import com.gamelist.dslist.entities.GameList;
import com.gamelist.dslist.repositories.GameListRepository;
import com.gamelist.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
