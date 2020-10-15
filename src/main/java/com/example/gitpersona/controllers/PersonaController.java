package com.example.gitpersona.controllers;

import com.example.gitpersona.entities.Persona;
import com.example.gitpersona.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

}

