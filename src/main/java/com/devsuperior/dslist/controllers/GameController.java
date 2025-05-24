package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entites.Game;
import com.devsuperior.dslist.entites.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.services.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){
        List<GameMinDTO> gameList = gameService.findALL();
        return ResponseEntity.ok().body(gameList);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Game> findById(@PathVariable Long id){
        Game obj = gameService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
