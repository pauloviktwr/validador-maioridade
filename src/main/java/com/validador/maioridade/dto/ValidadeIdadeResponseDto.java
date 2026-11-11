package com.validador.maioridade.dto;

public record ValidadeIdadeResponseDto(
        boolean maiorDeIdade,
        int idade,
        String mensagem
) {
}
