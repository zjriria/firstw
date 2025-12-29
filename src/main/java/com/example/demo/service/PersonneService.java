package com.example.demo.service;


import java.util.List;

import exceptions.PersonneNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.model.Personne;

@Service
public class PersonneService {
    private final PersonneRepository r;

    public PersonneService(PersonneRepository r) {
        this.r = r;
    }

    public List<Personne> getAll() {
        return r.findAll();
    }


    public Personne getById(Long id) {
        return r.findById(id).orElseThrow(() -> new PersonneNotFoundException(id));
    }

    public Personne create(Personne d) {
        Personne p = new Personne(d.getNom(), d.getPrenom());
        Personne s = r.save(p);
        return new Personne( s.getNom(), s.getPrenom());
    }
}