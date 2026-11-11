package com.validador.maioridade.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = MaiorDeIdadeValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface MaiorDeIdade {

    String message() default "Usuário deve ser maior de idade (18 anos ou mais).";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
