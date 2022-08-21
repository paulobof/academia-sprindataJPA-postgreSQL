package br.com.paulobof.academiaspringboot.service;

import br.com.paulobof.academiaspringboot.entity.Matricula;
import br.com.paulobof.academiaspringboot.DTO.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}
