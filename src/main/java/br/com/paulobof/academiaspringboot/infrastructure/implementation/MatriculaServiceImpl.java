package br.com.paulobof.academiaspringboot.infrastructure.implementation;

import br.com.paulobof.academiaspringboot.domain.entity.Matricula;
import br.com.paulobof.academiaspringboot.domain.dto.MatriculaDto;
import br.com.paulobof.academiaspringboot.domain.service.MatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Override
    public Matricula create(MatriculaDto form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
