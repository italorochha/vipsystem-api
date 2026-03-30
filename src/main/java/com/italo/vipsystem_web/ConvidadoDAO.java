package com.italo.vipsystem_web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ConvidadoDAO {

    public ConvidadoDAO() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:sqlite:banco_vip.db");
            String sql = "CREATE TABLE IF NOT EXISTS convidados (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, idade INTEGER, tipoIngresso TEXT)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.execute();
            conexao.close();
        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public List<Vip> buscarTodos() {
        List<Vip> listaDeVips = new ArrayList<>();

        try {
            Connection conexao = DriverManager.getConnection("jdbc:sqlite:banco_vip.db");
            String sql = "SELECT * FROM convidados";
            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nome = resultado.getString("nome");
                int idade = resultado.getInt("idade");
                String ingresso = resultado.getString("tipoIngresso");
                Vip convidado = new Vip(id, nome, idade, ingresso);
                listaDeVips.add(convidado);
            }
            conexao.close();

        } catch (Exception erro) {
            System.out.println("Erro ao buscar no banco: " + erro.getMessage());
        }

        return listaDeVips;
    }
    public void salvar(Vip novoVip) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:sqlite:banco_vip.db");
            String sql = "INSERT INTO convidados (nome, idade, tipoIngresso) VALUES (?, ?, ?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, novoVip.getNome());
            comando.setInt(2, novoVip.getIdade());
            comando.setString(3, novoVip.getTipoIngresso());
            comando.execute();
            conexao.close();
            System.out.println(" VIP " + novoVip.getNome() + " salvo no banco com sucesso!");
        } catch (Exception erro) {
            System.out.println(" Erro ao salvar no banco: " + erro.getMessage());
        }
    }
    public void deletar(int id) {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:sqlite:banco_vip.db");
            String sql = "DELETE FROM convidados WHERE id = ?";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setInt(1, id); // Troca a interrogação pelo ID
            comando.execute();
            conexao.close();
            System.out.println(" VIP com ID " + id + " foi DELETADO do banco!");
        } catch (Exception erro) {
            System.out.println(" Erro ao deletar: " + erro.getMessage());
        }
    }
}