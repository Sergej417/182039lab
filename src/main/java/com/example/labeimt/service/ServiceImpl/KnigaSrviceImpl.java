package com.example.labeimt.service.ServiceImpl;

import com.example.labeimt.Model.Kniga;
import com.example.labeimt.Repository.jpa.KnigaRepository;
import com.example.labeimt.service.KnigaService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KnigaSrviceImpl implements KnigaService {

    private final KnigaService knigaService;
    private final KnigaRepository knigaRepository;

    public KnigaSrviceImpl(@Lazy KnigaService knigaService, KnigaRepository knigaRepository) {
        this.knigaService = knigaService;
        this.knigaRepository = knigaRepository;
    }

    @Override
    public List<Kniga> findAll() {
        return this.knigaRepository.findAll();
    }

    @Override
    public Optional<Kniga> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Kniga> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Kniga> save(String name, Long authorid, Integer avelableCopies) {
        return Optional.empty();
    }

    @Override
    public Optional<Kniga> edit(Long id, String name, Long authorid, Integer avelableCopies) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {
        this.knigaService.deleteById(id);


    }
}
