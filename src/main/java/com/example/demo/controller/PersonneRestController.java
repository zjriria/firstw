package com.example.demo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Personne;
import com.example.demo.service.PersonneService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/personnes")
public class PersonneRestController {

    private PersonneService personneService;

    @GetMapping()
    public ResponseEntity<List<Personne>> getPersonnes() {
        return new ResponseEntity<>(
                personneService.getAll(),
                HttpStatus.FOUND
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personne> getPersonne(@PathVariable("id") long id) {
        return new ResponseEntity<>(
                personneService.getById(id),
                HttpStatus.OK
        );
    }

    @PostMapping()
    public ResponseEntity<Personne> addPersonne(@RequestBody Personne personne) {
        return new ResponseEntity<>(
                personneService.create(personne),
                HttpStatus.CREATED
        );
    }
}