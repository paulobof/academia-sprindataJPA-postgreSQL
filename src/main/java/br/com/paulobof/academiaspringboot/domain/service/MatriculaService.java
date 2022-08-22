package br.com.paulobof.academiaspringboot.domain.service;

import br.com.paulobof.academiaspringboot.domain.entity.Matricula;
import br.com.paulobof.academiaspringboot.domain.dto.MatriculaDto;

import java.util.List;

public interface MatriculaService {

    Matricula create(MatriculaDto form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);

    void delete(Long id);
}
