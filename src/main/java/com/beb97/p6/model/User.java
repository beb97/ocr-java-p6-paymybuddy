package com.beb97.p6.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    String firstName;
    String lastName;

//    @Column(unique = true)
    String email;

//    @ManyToMany(targetEntity = User.class)
//    private Set<User> contacts = new HashSet();

    @ManyToMany(fetch = FetchType.LAZY, targetEntity = User.class)
    @JoinTable( // Pour améliorer le nommage de la table d'association et des colonnes
            name = "contact",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "contact_id", referencedColumnName = "id")})
    @JsonIgnoreProperties("contacts") // Pour éviter les contacts en casacade infinis
    private Set<User> contacts = new HashSet();

    public User() {
        this.firstName = "P";
        this.lastName = "B";
        this.email = "pb@gmail.com";
//        this.contacts  = new HashSet();
    }

    public void addContact(User user) {
        this.contacts.add(user);
    }
}
