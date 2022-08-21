package br.com.paulobof.academiaspringboot.entity;

import org.springframework.data.annotation.CreatedDate;
import java.time.LocalDateTime;

public class Matricula {

    private Long id;

    private Aluno aluno;

    @CreatedDate
    private LocalDateTime dataDaMatricula;
}
