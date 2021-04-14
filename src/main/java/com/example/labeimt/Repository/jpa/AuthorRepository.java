package com.example.labeimt.Repository.jpa;

import com.example.labeimt.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author,Long> {

    Optional<Author> findByName(String name);
    Optional<Author> findById(Long id);
    void deleteById(Long id);
    void deleteByName(String name);
}
