package com.weg.estrutura.pedagogica.Service;

import com.weg.estrutura.pedagogica.Dto.Requisicao.TarefaRequisicaoDto;
import com.weg.estrutura.pedagogica.Dto.Resposta.TarefaRespostaDto;
import com.weg.estrutura.pedagogica.Mapper.TarefaMapper;
import com.weg.estrutura.pedagogica.Model.Tarefa;
import com.weg.estrutura.pedagogica.Repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;
    private final TarefaMapper mapper;

    public TarefaService(TarefaRepository repository, TarefaMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public TarefaRespostaDto salvar(TarefaRequisicaoDto dto) {
        Tarefa tarefa = mapper.toEntity(dto);
        tarefa = repository.save(tarefa);

        return mapper.toDto(tarefa);
    }

    public List<TarefaRespostaDto> listar() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    public TarefaRespostaDto buscarPorId(Long id) {
        Tarefa tarefa = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrado!"));

        return mapper.toDto(tarefa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

