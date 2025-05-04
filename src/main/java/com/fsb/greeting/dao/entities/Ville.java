package com.fsb.greeting.dao.entities;

import jakarta.persistence.*;

@Entity
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private boolean capital;

    // Constructeurs
    public Ville() {
    }

    public Ville(String nom, boolean capital) {
        this.nom = nom;
        this.capital = capital;
    }

    public Ville(Long id, String nom, boolean capital) {
        this.id = id;
        this.nom = nom;
        this.capital = capital;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }
}

