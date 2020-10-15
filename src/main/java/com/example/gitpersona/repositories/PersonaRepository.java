package com.example.gitpersona.repositories;

import com.example.gitpersona.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
