package com.devsuperior.dslist.repository;

import com.devsuperior.dslist.entites.Gamer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends JpaRepository<Gamer,Long> {
}
