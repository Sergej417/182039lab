package com.example.labeimt.Repository.jpa;

import com.example.labeimt.Model.Author;
import com.example.labeimt.Model.Kniga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KnigaRepository extends JpaRepository<Kniga,Long> {

    Optional<Kniga> findByName(String name);
    void deleteByName(String name);
    Optional<Kniga> findById(Long id);
    void deleteById(Long id);
}
