package com.example.empty.samivic.entities;

import com.example.empty.samivic.Sami;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance
public class User<U, L extends Number> {

    @Id
    private long id;

    @NotNull
    private String email;

    private int age;

    @OneToOne
    @JoinColumn(name = "prenom")
    private Sami sami;

    public User() {
    }

    public User(int id, String email, int age){
        this.id=id;
        this.email=email;
        this.age=age;
    }

    // ...


//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
