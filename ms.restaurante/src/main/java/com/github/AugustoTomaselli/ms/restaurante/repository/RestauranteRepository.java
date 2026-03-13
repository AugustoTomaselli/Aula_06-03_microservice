package com.github.AugustoTomaselli.ms.restaurante.repository;// Define que este arquivo está na pasta de repositórios

import com.github.AugustoTomaselli.ms.restaurante.entities.Restaurante; // Importa a Entidade Restaurante (a tabela)
import org.springframework.data.jpa.repository.JpaRepository; // Importa as ferramentas prontas do Spring para banco de dados
import org.springframework.stereotype.Repository; // Marca esta interface como um componente de acesso a dados

@Repository // Avisa ao Spring que este arquivo é responsável por mexer no banco de dados
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    // Ao "estender" o JpaRepository, o Java já cria sozinho pra você:
    // .save() -> para salvar um restaurante
    // .findAll() -> para buscar todos os restaurantes
    // .findById() -> para buscar um restaurante específico pelo número dele
    // .deleteById() -> para apagar um restaurante
}
