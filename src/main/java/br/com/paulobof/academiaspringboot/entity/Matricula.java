package br.com.paulobof.academiaspringboot.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import java.time.LocalDateTime;

@EntityListeners(value = AuditingEntityListener.class)
public class Matricula {

    private Long id;

    private Aluno aluno;

    @CreatedDate
    private LocalDateTime dataDaMatricula;
}
