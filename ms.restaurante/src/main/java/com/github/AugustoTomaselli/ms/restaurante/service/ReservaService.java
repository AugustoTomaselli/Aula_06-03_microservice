package com.github.AugustoTomaselli.ms.restaurante.service;

import com.github.AugustoTomaselli.ms.restaurante.entities.Reserva;
import com.github.AugustoTomaselli.ms.restaurante.entities.Restaurante;
import com.github.AugustoTomaselli.ms.restaurante.exceptions.dto.ReservaDTO;
import com.github.AugustoTomaselli.ms.restaurante.repository.ReservaRepository;
import com.github.AugustoTomaselli.ms.restaurante.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




// ... outros imports ...
import com.github.AugustoTomaselli.ms.restaurante.entities.Restaurante;
import com.github.AugustoTomaselli.ms.restaurante.entities.Reserva;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    @Autowired
    private RestauranteRepository restauranteRepository;

    public ReservaDTO salvar(ReservaDTO dto) {
        Reserva entity = new Reserva();
        entity.setDataReserva(dto.dataReserva());
        entity.setNomeCliente(dto.nomeCliente());
        entity.setQtdePessoas(dto.qtdePessoas());

        // BUSCA O RESTAURANTE NO BANCO
        Restaurante rest = restauranteRepository.findById(dto.restauranteId())
                .orElseThrow(() -> new RuntimeException("Restaurante não encontrado!"));

        // ESTA LINHA É A QUE RESOLVE O SEU ERRO DE NULL NO LOG:
        entity.setRestaurante(rest);

        repository.save(entity);
        return dto;
    }
}
