package com.example.labeimt.Model;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
public class Kniga {

    //: id (Long), name (String),
    //category (enum), author (Author), availableCopies (Integer).
        @Id
        @GeneratedValue
        private Long id;

        private String name;

         @Enumerated(value = EnumType.STRING)
         private Category category;

         @ManyToOne
         private Author author;

         private Integer availableCopies;

    public Kniga(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }

    public Kniga() {
    }
}
