package com.senai.gtavi.Service;

import com.senai.gtavi.Entity.Personagem;
import com.senai.gtavi.Repository.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    private final PersonagemRepository repository;
    public PersonagemService(PersonagemRepository repository){
        this.repository = repository;
    }

    public void cadastrar(Personagem Persoragem){
        repository.save(Persoragem);

    }

    public List<Personagem> mostrar(){
        return repository.findAll();
    }

    public void deletar(long id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(long id, Personagem p){
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoria(p.getCategoria());
        personagem.setDescricao(p.getDescricao());
    }
}
