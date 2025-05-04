package com.fsb.greeting.business.services;

import com.fsb.greeting.dao.entities.Ville;
import com.fsb.greeting.dao.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {

    @Autowired
    private VilleRepository villeRepository;
    

    public List<Ville> getAllVilles() {
        return villeRepository.findAll();
    }

    public void deleteVille(Long id) {
        villeRepository.deleteById(id);
    }

    public void addVillesInitiales() {
        if (villeRepository.count() == 0) {
            villeRepository.save(new Ville());
            villeRepository.save(new Ville());
            villeRepository.save(new Ville());
        }
    }
}
