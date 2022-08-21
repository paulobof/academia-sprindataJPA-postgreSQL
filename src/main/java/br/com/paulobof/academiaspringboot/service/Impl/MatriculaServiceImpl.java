package br.com.paulobof.academiaspringboot.service.Impl;

import br.com.paulobof.academiaspringboot.entity.Matricula;
import br.com.paulobof.academiaspringboot.dto.MatriculaForm;
import br.com.paulobof.academiaspringboot.service.MatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements MatriculaService {
    @Override
    public Matricula create(MatriculaForm form) {
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
