package com.validador.maioridade.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

public class MaiorDeIdadeValidator implements ConstraintValidator<MaiorDeIdade, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        return Period.between(value, LocalDate.now()).getYears() >= 18;
    }
}
