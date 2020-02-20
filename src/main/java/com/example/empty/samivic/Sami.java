package com.example.empty.samivic;

import com.example.empty.samivic.entities.User;

import javax.persistence.*;

@Entity
public class Sami {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String prenom;

    /*@OneToOne(mappedBy = "sami")
    private User user;*/

      public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /*public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
