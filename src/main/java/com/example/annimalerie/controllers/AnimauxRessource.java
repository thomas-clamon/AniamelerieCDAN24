package com.example.annimalerie.controllers;

import com.example.annimalerie.services.ChienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Animaux")
public class AnimauxRessource {

    @Autowired
    private ChienService chienService;

    @GetMapping("get/{id}")
    public ResponseEntity get(@PathVariable String id) {

        Integer ID = null;
        try {
            ID = Integer.parseInt(id);
        } catch (Exception e) {
            return new ResponseEntity<>("l'id n'est pas bon", HttpStatusCode.valueOf(500));
        }
        return new ResponseEntity(chienService.get(ID), HttpStatusCode.valueOf(200));
    }
}
