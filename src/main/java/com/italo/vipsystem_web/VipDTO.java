package com.italo.vipsystem_web;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record VipDTO(
    @NotBlank(message = "O nome do VIP é obrigatório!") String nome,
    @Min(value = 18, message = "O VIP deve ter pelo menos 18 anos!") int idade,
    @NotBlank(message = "O tipo de ingresso não pode ficar em branco!") String tipoIngresso
) {}
