package com.italo.vipsystem_web;
import java.util.List;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BemVindoController {
    @Autowired
    private VipRepository repository;
    @GetMapping("/")
    public String mensagemBemVindo() {
        return "Bem-vindo ao Sistema VIP Web do Italo! Use /vips para ver os convidados VIPs.";
    }
    @GetMapping("/vips")
    public List<Vip> listarTodosOsVips() {
        return repository.findAll();
    }
    @PostMapping("/vips")
    public String cadastrarNovoVip(@Valid @RequestBody Vip novoVip) {
        repository.save(novoVip);
        return "VIP Cadastrado com sucesso pelo JPA!";
    }
    @DeleteMapping("/vips/{id}")
    public String apagarVip(@PathVariable int id) {
        repository.deleteById(id);
        return "Servidor avisa: VIP " + id + " foi deletado via JPA!";
    }

    @PutMapping("/vips/{id}")
    public String atualizarVip(@PathVariable int id, @Valid @RequestBody Vip vipAtualizado) {
        vipAtualizado.setId(id);
        repository.save(vipAtualizado);
        return "Servidor avisa: Dados do VIP " + id + " atualizados!";
    }
}
