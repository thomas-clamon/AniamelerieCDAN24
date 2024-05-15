package com.example.annimalerie.repesitories;

import com.example.annimalerie.entities.AnimauxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimauxRepository extends JpaRepository<AnimauxEntity, Integer> {
}
