package com.example.demo.controller;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.model.Personne;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
public class PersonneRestController {

    private PersonneRepository personneRepository;

    @GetMapping("/personnes")
    public List<Personne> getPersonnes() {
        return personneRepository.findAll();
    }

    @GetMapping("/personnes/{id}")
    public Personne getPersonne(@PathVariable("id") Long id) {
        return personneRepository.findById(id).orElse(null);
    }

    @PostMapping("/personnes")
    public Personne addPersonne(@RequestBody Personne personne) {
        return personneRepository.save(personne);
    }
    @DeleteMapping("/personnes/{id}")
    public void deletePersonne(@PathVariable("id") Long id) {
        personneRepository.deleteById(id);
    }
}