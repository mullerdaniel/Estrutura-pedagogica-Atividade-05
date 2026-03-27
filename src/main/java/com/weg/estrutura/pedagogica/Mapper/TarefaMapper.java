package com.weg.estrutura.pedagogica.Mapper;

import com.weg.estrutura.pedagogica.Dto.Requisicao.TarefaRequisicaoDto;
import com.weg.estrutura.pedagogica.Dto.Resposta.TarefaRespostaDto;
import com.weg.estrutura.pedagogica.Model.Tarefa;
import org.springframework.stereotype.Component;

@Component
public class TarefaMapper {

    public Tarefa toEntity(TarefaRequisicaoDto dto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(dto.getNome());
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setStatus(dto.getStatus());
        return tarefa;
    }

    public TarefaRespostaDto toDto(Tarefa tarefa) {
        TarefaRespostaDto dto = new TarefaRespostaDto();
        dto.setId(tarefa.getId());
        dto.setNome(tarefa.getTitulo());
        dto.setDescricao(tarefa.getDescricao());
        dto.setStatus(tarefa.getStatus());
        return dto;
    }
}
