package com.github.AugustoTomaselli.ms.restaurante.exceptions.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RestauranteDTO(
        Long id,
        @NotBlank @Size(min = 5, max = 120) String nome,
        @NotBlank @Size(min = 5, max = 120) String endereco,
        @NotBlank @Size(min = 3, max = 100) String cidade,
        @NotBlank @Size(min = 2, max = 2) String uf
) {}
