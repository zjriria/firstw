package com.example.demo.controller;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.model.Personne;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PersonneRestController {

    private PersonneRepository personneRepository;

    @GetMapping("/personnes")
    public List<Personne> getPersonnes() {

        return personneRepository.findAll();
    }

    @GetMapping("/personnes/Test/{id}")
    public Personne getPersonnetest(@PathVariable("id") Long id) {
        return personneRepository.findById(id).orElse(null);
    }
    @GetMapping("/personnes/{id}")
    public ResponseEntity<Personne> getPersonne(@PathVariable("id") long id) {
        Optional<Personne> personne = personneRepository.findById(id);

        if (personne.isPresent()) {

            return new ResponseEntity<>(personneRepository.findById(id).get(), HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
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