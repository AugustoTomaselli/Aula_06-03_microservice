package com.github.AugustoTomaselli.ms.restaurante.exceptions.dto;
// Ajustado para o seu padrão

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record ReservaDTO(
        Long id,

        @NotNull @FutureOrPresent
        LocalDate dataReserva,

        @NotBlank @Size(min = 3, max = 100)
        String nomeCliente,

        @NotNull @Min(1)
        Integer qtdePessoas,

        @NotNull
        @JsonProperty("restauranteId") // FORÇA o mapeamento do JSON
        Long restauranteId
) {}
