package com.italo.vipsystem_web;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindoController {

    @GetMapping("/")
    public String dizerOla() {
    return "<h1>Bem-vindo ao Sistema VIP Web do Italo! </h1>" +
    "<p>O meu primeiro servidor Spring Boot está no ar e escutando a internet!</p>";
    }
    @GetMapping("/meu-vip")
    public Vip retornarUmVip() {
        Vip convidado = new Vip("Italo Rocha", 21, "Camarote Premium");
        return convidado;
    }

    @GetMapping("/vips")
    public List<Vip> listarTodosOsVips() {
        ConvidadoDAO dao = new ConvidadoDAO();
        List<Vip> listaCompleta = dao.buscarTodos();
        return listaCompleta;
    }
    @PostMapping("/vips")
    public String cadastrarNovoVip(@RequestBody Vip novoVip) {
        ConvidadoDAO dao = new ConvidadoDAO();
        dao.salvar(novoVip);
        return "VIP Cadastrado com sucesso na API!";
    }
    @DeleteMapping("/vips/{id}")
    public String apagarVip(@PathVariable int id) {
        ConvidadoDAO dao = new ConvidadoDAO();
        dao.deletar(id);
        return "Servidor avisa: VIP " + id + " foi de arrasta pra cima!";
    }
    @PutMapping("/vips/{id}")
    public String atualizarVip(@PathVariable int id, @RequestBody Vip vipAtualizado) {
        ConvidadoDAO dao = new ConvidadoDAO();
        dao.atualizar(id, vipAtualizado);
        return "Servidor avisa: Dados do VIP " + id + " foram atualizados!";
    }
}
