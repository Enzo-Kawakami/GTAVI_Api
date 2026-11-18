package com.senai.gtavi.Controller;

import com.senai.gtavi.Entity.Personagem;
import com.senai.gtavi.Repository.PersonagemRepository;
import com.senai.gtavi.Service.PersonagemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/personagens")
public class PersonagemController {

    private final PersonagemService service;
    public PersonagemController(PersonagemService service){
        this.service = service;
    }

    @GetMapping
    public List<Personagem> mostarPersonagem(){
        return service.mostrar();
    }

    @PostMapping
    public void criar(@RequestBody Personagem persona){
        service.cadastrar(persona);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable long id){
        service.deletar(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable long id,@RequestBody Personagem p){
        service.alterar(id,p);
    }
}
