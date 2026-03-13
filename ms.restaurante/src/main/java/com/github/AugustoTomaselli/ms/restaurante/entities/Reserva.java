package com.github.AugustoTomaselli.ms.restaurante.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "tb_reserva")
@Data
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_reserva", nullable = false)
    private LocalDate dataReserva;

    @Column(name = "nome_cliente", nullable = false, length = 100)
    private String nomeCliente;

    @Column(name = "qtd_pessoas", nullable = false)
    private Integer qtdePessoas;

    // ESTA É A PARTE CRÍTICA:
    @ManyToOne(fetch = FetchType.EAGER) // Muitas reservas para um restaurante [cite: 24]
    @JoinColumn(name = "restaurante_id", nullable = false) // Nome exato da FK no banco
    private Restaurante restaurante;
}
