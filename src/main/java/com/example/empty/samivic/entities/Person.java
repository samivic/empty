package com.example.empty.samivic.entities;

import com.example.empty.samivic.Sami;

import javax.persistence.Entity;

@Entity
public class Person extends User {
    public String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /* ... */ }
