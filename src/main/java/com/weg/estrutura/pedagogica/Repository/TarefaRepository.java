package com.weg.estrutura.pedagogica.Repository;

import com.weg.estrutura.pedagogica.Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
