package com.weg.estrutura.pedagogica.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_projeto", nullable = false)
    String nome;

    @Column(name = "descricao_projeto", nullable = false)
    String descricao;

    @OneToMany(mappedBy = "projeto")
    private List<Tarefa> tarefas;
}
