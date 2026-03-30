package com.italo.vipsystem_web;

public class Vip {
    private int id; // A nossa nova gavetinha do ID!
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

    public Vip(String nome, int idade, String tipoIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.tipoIngresso = tipoIngresso;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getTipoIngresso() { return tipoIngresso; }
}