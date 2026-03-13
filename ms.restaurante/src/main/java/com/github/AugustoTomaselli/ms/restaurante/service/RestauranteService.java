package com.github.AugustoTomaselli.ms.restaurante.service;

import com.github.AugustoTomaselli.ms.restaurante.entities.Restaurante;
import com.github.AugustoTomaselli.ms.restaurante.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired; // (Faz o Spring conectar os arquivos automaticamente)
import org.springframework.stereotype.Service; // (Diz que esta classe guarda as regras de negócio)
import java.util.List;

@Service
public class RestauranteService {

    @Autowired // (Conecta o Repositório aqui para podermos usar o banco de dados)
    private RestauranteRepository repository;

    public List<Restaurante> listarTodos() {
        return repository.findAll(); // (Chama o banco para buscar todos os restaurantes)
    }


}