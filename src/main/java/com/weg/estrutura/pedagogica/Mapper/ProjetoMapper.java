package com.weg.estrutura.pedagogica.Mapper;

import com.weg.estrutura.pedagogica.Dto.Requisicao.ProjetoRequisicaoDto;
import com.weg.estrutura.pedagogica.Dto.Resposta.ProjetoRespostaDto;
import com.weg.estrutura.pedagogica.Model.Projeto;
import org.springframework.stereotype.Component;

@Component
public class ProjetoMapper {

    public Projeto toEntity(ProjetoRequisicaoDto dto) {
        Projeto projeto = new Projeto();
        projeto.setNome(dto.getNome());
        projeto.setDescricao(dto.getDescricao());
        return projeto;
    }

    public ProjetoRespostaDto toDto(Projeto projeto) {
        ProjetoRespostaDto dto = new ProjetoRespostaDto();
        dto.setId(projeto.getId());
        dto.setNome(projeto.getNome());
        dto.setDescricao(projeto.getDescricao());
        return dto;
    }
}
