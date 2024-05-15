package com.example.annimalerie.services;

import com.example.annimalerie.dtos.OutChienDto;
import com.example.annimalerie.entities.AnimauxEntity;
import com.example.annimalerie.repesitories.IAnimauxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ChienService  implements IChienService{

    @Autowired
    private IAnimauxRepository repository;
    @Override
    public int calculerAgeChien(LocalDate date_naissance) {
        return 0;
    }

    @Override
    public int calculerAgeReel(LocalDate date_naissance) {
        return 0;
    }

    @Override
    public OutChienDto toDto(AnimauxEntity entity) {
        OutChienDto dto = new OutChienDto();

        dto.setNom(entity.getNom());
        dto.setEspece(entity.getEspece());
        dto.setAge_chien(calculerAgeChien(entity.getDateNaissance()));
        dto.setAge_reel(calculerAgeReel(entity.getDateNaissance()));
        return  dto;
    }

    @Override
    public OutChienDto get(Integer id) {
        return toDto(repository.findById(id).get());
    }
}