package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entites.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repository.GameRepository;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findALL(){
        var list = gameRepository.findAll();
        return list;
    }
}
