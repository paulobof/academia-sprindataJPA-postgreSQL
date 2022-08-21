package br.com.paulobof.academiaspringboot.service;

import br.com.paulobof.academiaspringboot.entity.Aluno;
import br.com.paulobof.academiaspringboot.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.DTO.AlunoForm;
import br.com.paulobof.academiaspringboot.DTO.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
