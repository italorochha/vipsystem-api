package com.italo.vipsystem_web;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "convidados")
public class Vip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "O nome do VIP é obrigatório!")
    private String nome;

    @Min(value = 18, message = "O VIP deve ter pelo menos 18 anos!")
    private int idade;

    @NotBlank(message = "O tipo de ingresso não pode ficar em branco!")
    private String tipoIngresso;
    public Vip() {}
    public Vip(int id, String nome, int idade, String tipoIngresso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
    }
    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getTipoIngresso() { return tipoIngresso; }
    public void setId(int id) {
    this.id = id;
    }

}