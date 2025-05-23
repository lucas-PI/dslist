package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entites.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.services.GameService;

import java.util.List;

@RestController
@RequestMapping(value = "/gamers")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<Game>> findAll(){
        List<Game> gamerList = gameService.findALL();
        return ResponseEntity.ok().body(gamerList);
    }

}
