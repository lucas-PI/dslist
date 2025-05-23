package com.devsuperior.dslist.services;

import com.devsuperior.dslist.entites.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.devsuperior.dslist.repository.GamerRepository;

import java.util.List;

@Service
public class GamerService {
    @Autowired
    private GamerRepository gamerRepository;

    public List<Gamer> findALL(){
        var list = gamerRepository.findAll();
        return list;
    }
}
