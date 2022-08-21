package br.com.paulobof.academiaspringboot.service.Impl;

import br.com.paulobof.academiaspringboot.entity.Aluno;
import br.com.paulobof.academiaspringboot.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.DTO.AlunoForm;
import br.com.paulobof.academiaspringboot.DTO.AlunoUpdateForm;
import br.com.paulobof.academiaspringboot.service.AlunoService;

import java.util.List;

public class AlunoServiceImpl implements AlunoService {
    @Override
    public Aluno create(AlunoForm form) {
        return null;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        return null;
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
