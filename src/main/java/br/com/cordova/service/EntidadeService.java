package br.com.cordova.service;

import br.com.cordova.model.Entidade;
import br.com.cordova.model.EntidadeCarro;
import br.com.cordova.repository.EntidadeRepository;
import br.com.cordova.util.transacional.Transacional;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class EntidadeService implements Serializable{

    @Inject
    private EntidadeRepository entidadeRepository;


    @Transacional
    public void salvar(Entidade destinatario)  {
        entidadeRepository.salvar(destinatario);
    }

    @Transacional
    public void excluir(Entidade entidade) {
        entidadeRepository.excluir(entidade);
    }

    @Transacional
    public List<Entidade> listarEntidades(){
        return entidadeRepository.listarEntidades();
    }

    @Transacional
    public Entidade entidadePorId(Long id){
        return entidadeRepository.entidadePorId(id);
    }

    @Transacional
    public EntidadeCarro entidadeCarroPorId(Long id) {
        return entidadeRepository.entidadeCarroPorId(id);
    }
}
