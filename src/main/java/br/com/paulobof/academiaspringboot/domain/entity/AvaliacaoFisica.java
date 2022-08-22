package br.com.paulobof.academiaspringboot.domain.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import java.time.LocalDateTime;

@EntityListeners(value = AuditingEntityListener.class)
public class AvaliacaoFisica {

    private Long id;

    private Aluno aluno;

    @CreatedDate
    private LocalDateTime dataDaAvaliacao;

    private double peso;

    private double altura;

}
