package com.weg.estrutura.pedagogica.Dto.Resposta;

import com.weg.estrutura.pedagogica.Model.Projeto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TarefaRespostaDto {

    private Long id;
    private String nome;
    private String descricao;
    private String status;
    private Projeto projeto;
}
