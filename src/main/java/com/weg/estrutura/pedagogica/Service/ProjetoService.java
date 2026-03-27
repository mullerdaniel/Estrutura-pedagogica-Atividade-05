package com.weg.estrutura.pedagogica.Service;

import com.weg.estrutura.pedagogica.Dto.Requisicao.ProjetoRequisicaoDto;
import com.weg.estrutura.pedagogica.Dto.Resposta.ProjetoRespostaDto;
import com.weg.estrutura.pedagogica.Mapper.ProjetoMapper;
import com.weg.estrutura.pedagogica.Model.Projeto;
import com.weg.estrutura.pedagogica.Repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;
    private final ProjetoMapper mapper;

    public ProjetoService(ProjetoRepository repository, ProjetoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProjetoRespostaDto salvar(ProjetoRequisicaoDto dto) {
        Projeto projeto = mapper.toEntity(dto);
        projeto = repository.save(projeto);

        return mapper.toDto(projeto);
    }

    public List<ProjetoRespostaDto> listar() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .toList();
    }

    public ProjetoRespostaDto buscarPorId(Long id) {
        Projeto projeto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado!"));

        return mapper.toDto(projeto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
