package com.seduc2.gourmetfy.intity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalTime;
@Entity
public class Restaurante {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private int quantidadePessoas;
    private LocalDate data;
    private LocalTime horario;
    private String observacao;

    public Restaurante(String nome, String telefone, int quantidadePessoas, LocalDate data, LocalTime horario, String observacao) {
        this.nome = nome;
        this.telefone = telefone;
        this.quantidadePessoas = quantidadePessoas;
        this.data = data;
        this.horario = horario;
        this.observacao = observacao;

    }

    public Restaurante(Long id, String nome, String telefone, int quantidadePessoas, LocalDate data, LocalTime horario, String observacao) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.quantidadePessoas = quantidadePessoas;
        this.data = data;
        this.horario = horario;
        this.observacao = observacao;
    }

    public Restaurante  (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
