package com.weg.estrutura.pedagogica.Controller;

import com.weg.estrutura.pedagogica.Dto.Requisicao.ProjetoRequisicaoDto;
import com.weg.estrutura.pedagogica.Dto.Resposta.ProjetoRespostaDto;
import com.weg.estrutura.pedagogica.Service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProjetoController {

    private final ProjetoService service;

    public ProjetoController(ProjetoService service) {
        this.service = service;
    }

    @PostMapping
    public ProjetoRespostaDto salvar(@RequestBody ProjetoRequisicaoDto dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<ProjetoRespostaDto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public ProjetoRespostaDto buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}

