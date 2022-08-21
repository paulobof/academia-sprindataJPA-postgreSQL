package br.com.paulobof.academiaspringboot.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

public class Matricula {

    private Long id;

    private Aluno aluno;

    private LocalDateTime dataDaMatricula = LocalDateTime.now();
}
