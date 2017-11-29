package br.com.cordova.controller;

import br.com.cordova.model.Entidade;
import br.com.cordova.model.EntidadeCarro;
import br.com.cordova.model.Servico;
import br.com.cordova.model.ServicoItem;
import br.com.cordova.service.EntidadeService;
import br.com.cordova.service.ServicoService;
import br.com.cordova.util.jsf.FacesUtil;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ServicoBean implements Serializable {

    @Inject
    private ServicoService servicoService;

    @Inject
    private EntidadeService entidadeService;

    private Servico servico;
    private ServicoItem servicoItem;

    private List<Entidade> entidades;
    private List<Entidade> entidadesFiltro;

    public void inicializar() {
        refreshEntidade();
        servicoItem = new ServicoItem();
        if(servico == null) {
            servico = new Servico();
        }
    }

    public void salvar() {
        servicoService.salvar(servico);
    }

    public void incluirServicoItem() {
        servicoItem.setServico(servico);
        servico.getServicoItems().add(servicoItem);
    }

    public void excluirServicoItem(ServicoItem servicoItem) {
        servico.getServicoItems().remove(servicoItem);
    }

    public void refreshEntidade() {
        entidades = entidadeService.listarEntidades();
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public List<Entidade> getEntidades() {
        return entidades;
    }

    public void setEntidades(List<Entidade> entidades) {
        this.entidades = entidades;
    }

    public List<Entidade> getEntidadesFiltro() {
        return entidadesFiltro;
    }

    public void setEntidadesFiltro(List<Entidade> entidadesFiltro) {
        this.entidadesFiltro = entidadesFiltro;
    }

    public ServicoItem getServicoItem() {
        return servicoItem;
    }

    public void setServicoItem(ServicoItem servicoItem) {
        this.servicoItem = servicoItem;
    }
}
