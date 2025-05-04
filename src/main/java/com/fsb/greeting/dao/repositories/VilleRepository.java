package com.fsb.greeting.dao.repositories;


import com.fsb.greeting.dao.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Long> {

    Ville save(Ville ville);
}

