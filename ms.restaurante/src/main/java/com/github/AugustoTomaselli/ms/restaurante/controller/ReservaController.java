package com.github.AugustoTomaselli.ms.restaurante.controller;

import com.github.AugustoTomaselli.ms.restaurante.entities.Reserva; // Importa a Entidade Reserva
import com.github.AugustoTomaselli.ms.restaurante.exceptions.dto.ReservaDTO;
import com.github.AugustoTomaselli.ms.restaurante.repository.ReservaRepository; // Importa o Repositório Reserva
import com.github.AugustoTomaselli.ms.restaurante.service.ReservaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    /**
     * Endpoint para criar uma nova reserva.
     * O uso do @Valid garante que as regras do DER (como qtd_pessoas > 0) sejam checadas.
     */
    @PostMapping
    public ResponseEntity<ReservaDTO> salvar(@Valid @RequestBody ReservaDTO dto) {
        // Log para monitoração no console do IntelliJ
        System.out.println("Recebendo requisição de reserva para o Restaurante ID: " + dto.restauranteId());

        ReservaDTO novoDto = service.salvar(dto);

        // Retorna Status 201 (Created) se tudo correr bem
        return ResponseEntity.status(HttpStatus.CREATED).body(novoDto);
    }
}