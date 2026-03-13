package com.github.AugustoTomaselli.ms.restaurante.controller;

import com.github.AugustoTomaselli.ms.restaurante.entities.Reserva;
import com.github.AugustoTomaselli.ms.restaurante.entities.Restaurante; // Importa a Entidade (classe da tabela)
import com.github.AugustoTomaselli.ms.restaurante.repository.RestauranteRepository; // Importa o Repositório
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired; // Conector automático
import org.springframework.web.bind.annotation.*; // Ferramentas para URLs
import java.util.List;

@RestController // Diz que esta classe responde ao Postman
@RequestMapping("/restaurantes") // Define o endereço: localhost:8080/restaurantes
public class RestauranteController {

    @Autowired // Liga o repositório aqui dentro sozinho
    private RestauranteRepository repository;

    @PostMapping // Verbo POST: usado para criar um novo restaurante
    public Restaurante criar(@RequestBody Restaurante restaurante) {
        // @RequestBody: transforma o JSON do Postman directamente na classe Restaurante
        return repository.save(restaurante);
    }

    @OneToMany(mappedBy = "restaurante") // O nome aqui deve ser igual ao atributo na classe Reserva
    private List<Reserva> reservas;
}
