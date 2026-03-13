package com.github.AugustoTomaselli.ms.restaurante.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "tb_restaurante")
@Data
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Este é o único ID que deve existir aqui

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 120)
    private String endereco;

    @Column(nullable = false, length = 100)
    private String cidade;

    @Column(nullable = false, length = 2)
    private String uf;

    // Apenas mapeia o lado inverso, não cria coluna no banco
    @OneToMany(mappedBy = "restaurante")
    private List<Reserva> reservas;
}
