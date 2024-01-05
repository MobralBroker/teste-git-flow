package com.solinfbroker.msemail.dtos;

import jakarta.validation.constraints.NotBlank;

public record EmailDTO(@NotBlank String titulo, @NotBlank String corpo,@NotBlank String remetente) {
    
}
