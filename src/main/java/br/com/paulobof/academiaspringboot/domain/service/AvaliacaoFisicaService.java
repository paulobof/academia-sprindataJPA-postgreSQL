package br.com.paulobof.academiaspringboot.domain.service;

import br.com.paulobof.academiaspringboot.domain.entity.AvaliacaoFisica;
import br.com.paulobof.academiaspringboot.domain.dto.AvaliacaoFisicaDto;
import br.com.paulobof.academiaspringboot.domain.dto.AvaliacaoFisicaUpdateDto;

import java.util.List;

public interface AvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaDto form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDto formUpdate);

    void delete(Long id);
}
