package com.github.AugustoTomaselli.ms.restaurante.repository;
 // Define a pasta onde o arquivo está salvo

import com.github.AugustoTomaselli.ms.restaurante.entities.Reserva; // Importa a Entidade Reserva (a tabela do banco)
import org.springframework.data.jpa.repository.JpaRepository; // Importa as ferramentas prontas de banco de dados
import org.springframework.stereotype.Repository; // Marca esta classe como um componente de banco

@Repository // Avisa ao Spring que este arquivo cuida de salvar as informações
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    // Ao estender (herdar) o JpaRepository, o Spring Data JPA (tecnologia que automatiza as tarefas de banco)
    // cria sozinho para você os comandos:
    // .save() -> para gravar a reserva
    // .findAll() -> para listar todas as reservas
    // .findById() -> para buscar uma reserva específica
}
