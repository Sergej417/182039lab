package com.example.labeimt.Repository.jpa;

import com.example.labeimt.Model.Author;
import com.example.labeimt.Model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepisotry extends JpaRepository<Country,Long> {

    Optional<Country> findByName(String name);
    void deleteByName(String name);
    Optional<Country> findById(Long id);
    void deleteById(Long id);
}
