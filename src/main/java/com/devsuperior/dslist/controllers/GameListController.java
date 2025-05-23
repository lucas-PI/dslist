package com.devsuperior.dslist.controllers;
import com.devsuperior.dslist.entites.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> findAll(){
         List<GameListDTO> listObj = gameListService.findALl();
        return ResponseEntity.ok().body(listObj);
    }
}
