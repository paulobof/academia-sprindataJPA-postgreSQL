package br.com.paulobof.academiaspringboot.infrastructure.implementation;

import br.com.paulobof.academiaspringboot.domain.service.AlunoService;
import br.com.paulobof.academiaspringboot.domain.entity.Aluno;
import br.com.paulobof.academiaspringboot.domain.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.domain.dto.AlunoDto;
import br.com.paulobof.academiaspringboot.domain.dto.AlunoUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Override
    public Aluno create(AlunoDto form) {
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
    public Aluno update(Long id, AlunoUpdateDto formUpdate) {
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
