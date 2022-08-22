package br.com.paulobof.academiaspringboot.domain.service;

import br.com.paulobof.academiaspringboot.domain.entity.Aluno;
import br.com.paulobof.academiaspringboot.domain.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.domain.dto.AlunoDto;
import br.com.paulobof.academiaspringboot.domain.dto.AlunoUpdateDto;

import java.util.List;

public interface AlunoService {

    Aluno create(AlunoDto form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateDto formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
