package br.com.paulobof.academiaspringboot.service;

import br.com.paulobof.academiaspringboot.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.dto.AvaliacaoFisicaForm;
import br.com.paulobof.academiaspringboot.dto.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
