package com.italo.vipsystem_web;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // 👈 Magia 1: Avisa o Spring que isso é uma tabela do banco
@Table(name = "convidados") // 👈 Mantemos o nome da tabela que você já usava
public class Vip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 👈 Magia 3: O Banco gera o ID automático (AUTOINCREMENT)
    private int id;
    private String nome;
    private int idade;
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