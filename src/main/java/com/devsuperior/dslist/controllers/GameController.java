package com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.entites.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devsuperior.dslist.services.GamerService;

import java.util.List;

@RestController
@RequestMapping(value = "/gamers")
public class GamerController {
    @Autowired
    private GamerService gamerService;

    @GetMapping
    public ResponseEntity<List<Gamer>> findAll(){
        List<Gamer> gamerList = gamerService.findALL();
        return ResponseEntity.ok().body(gamerList);
    }

}
