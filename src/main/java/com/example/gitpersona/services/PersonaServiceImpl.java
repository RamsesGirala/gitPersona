package com.example.gitpersona.services;

import com.example.gitpersona.entities.Persona;
import com.example.gitpersona.repositories.BaseRepository;
import com.example.gitpersona.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }
}
