package com.weg.estrutura.pedagogica.Dto.Requisicao;

import com.weg.estrutura.pedagogica.Model.Projeto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TarefaRequisicaoDto {

    private String nome;
    private String descricao;
    private String status;
    private Projeto projeto;
}
