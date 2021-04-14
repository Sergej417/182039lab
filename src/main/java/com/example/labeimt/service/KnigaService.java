package com.example.labeimt.service;

import com.example.labeimt.Model.Kniga;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface KnigaService {
    List<Kniga> findAll();
    Optional<Kniga> findById(Long id);
    Optional<Kniga> findByName(String name);
    Optional<Kniga> save(String name,Long authorid , Integer avelableCopies);
    Optional<Kniga> edit(Long id,String name,Long authorid , Integer avelableCopies);
    void deleteById(Long id);
}
