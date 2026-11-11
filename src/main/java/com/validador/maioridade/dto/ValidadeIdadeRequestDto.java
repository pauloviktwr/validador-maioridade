package com.validador.maioridade.dto;

import com.validador.maioridade.validation.MaiorDeIdade;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ValidadeIdadeRequestDto(
        @NotNull(message = "A data de nascimento é obrigatória.")
        @MaiorDeIdade(message = "Acesso negado: menor de 18 anos.")
        LocalDate dataNascimento
) {
}
