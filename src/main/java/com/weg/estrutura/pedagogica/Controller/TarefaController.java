package com.weg.estrutura.pedagogica.Controller;

import com.weg.estrutura.pedagogica.Dto.Requisicao.TarefaRequisicaoDto;
import com.weg.estrutura.pedagogica.Dto.Resposta.TarefaRespostaDto;
import com.weg.estrutura.pedagogica.Service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @PostMapping
    public TarefaRespostaDto salvar(@RequestBody TarefaRequisicaoDto dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<TarefaRespostaDto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public TarefaRespostaDto buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

