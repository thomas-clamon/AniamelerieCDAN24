package com.example.annimalerie.services;

import com.example.annimalerie.dtos.OutChienDto;
import com.example.annimalerie.entities.AnimauxEntity;

import java.time.LocalDate;

public interface IChienService {


    int calculerAgeChien(LocalDate date_naissance);

    int calculerAgeReel(LocalDate date_naissance);

    OutChienDto toDto (AnimauxEntity entity);

    OutChienDto get (Integer id);
}
