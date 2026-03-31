package com.italo.vipsystem_web;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
@AutoConfigureMockMvc 
class VipsystemWebApplicationTests {

    @Autowired
    private MockMvc roboTestador;
    @Test
    void deveRetornarMensagemDeBoasVindasNaRaiz() throws Exception {
        roboTestador.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Bem-vindo ao Sistema VIP Web do Italo! Use /vips para ver os convidados VIPs."));
    }
}
