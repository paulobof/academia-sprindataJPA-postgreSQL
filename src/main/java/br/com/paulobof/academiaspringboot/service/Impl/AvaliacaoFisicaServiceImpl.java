package br.com.paulobof.academiaspringboot.service.Impl;

import br.com.paulobof.academiaspringboot.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.dto.AvaliacaoFisicaForm;
import br.com.paulobof.academiaspringboot.dto.AvaliacaoFisicaUpdateForm;
import br.com.paulobof.academiaspringboot.service.AvaliacaoFisicaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
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
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
