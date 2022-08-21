package br.com.paulobof.academiaspringboot.service.Impl;

import br.com.paulobof.academiaspringboot.entity.Aluno;
import br.com.paulobof.academiaspringboot.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.dto.AlunoForm;
import br.com.paulobof.academiaspringboot.dto.AlunoUpdateForm;
import br.com.paulobof.academiaspringboot.service.AlunoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
