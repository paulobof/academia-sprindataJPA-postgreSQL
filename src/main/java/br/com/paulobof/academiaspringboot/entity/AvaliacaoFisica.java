package br.com.paulobof.academiaspringboot.entity;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class AvaliacaoFisica {

    private Long id;

    private Aluno aluno;

    @CreatedDate
    private LocalDateTime dataDaAvaliacao;

    private double peso;

    private double altura;

}
