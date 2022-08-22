package br.com.paulobof.academiaspringboot.infrastructure.implementation;

import br.com.paulobof.academiaspringboot.domain.service.AvaliacaoFisicaService;
import br.com.paulobof.academiaspringboot.domain.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.domain.dto.AvaliacaoFisicaDto;
import br.com.paulobof.academiaspringboot.domain.dto.AvaliacaoFisicaUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDto form) {
        return null;
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
