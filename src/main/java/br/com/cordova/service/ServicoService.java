package br.com.cordova.service;

import br.com.cordova.model.Servico;
import br.com.cordova.repository.ServicoRepository;
import br.com.cordova.util.transacional.Transacional;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class ServicoService implements Serializable {

    @Inject
    private ServicoRepository servicoRepository;

    @Transacional
    public void salvar(Servico servico) {
        servicoRepository.salvar(servico);
    }

    @Transacional
    public Servico buscarPorId(Long id) {
        return servicoRepository.buscarPorId(id);
    }

    @Transacional
    public List<Servico> listarServicos() {
        return servicoRepository.listarServicos();
    }

}
