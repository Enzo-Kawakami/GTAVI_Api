package com.senai.gtavi.Entity;

import com.senai.gtavi.Entity.Enuns.Categoria;
import jakarta.persistence.*;

@Entity
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String apelido;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private String imagem;
    private String descricao;

    public Personagem() {
    }

    public Personagem(long id, String nome, String apelido, Categoria categoria, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Personagem(String nome, String apelido, Categoria categoria, String imagem, String descricao) {
        this.nome = nome;
        this.apelido = apelido;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
