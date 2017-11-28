package br.com.cordova.controller;


import br.com.cordova.model.Entidade;
import br.com.cordova.service.EntidadeService;
import br.com.cordova.util.jsf.FacesUtil;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class EntidadesBean implements Serializable {

    @Inject
    private FacesContext facesContext;

    @Inject
    private EntidadeService entidadeService;

    private Entidade entidade;
    private List<Entidade> entidades;
    private List<Entidade> entidadesFiltro;


    @PostConstruct
    public void init() {
        if (facesContext.getViewRoot().getViewId().contains("Cliente")) {
            entidades = entidadeService.listarEntidades();
        }
    }

    public void excluir() {
        entidadeService.excluir(entidade);
        entidade = new Entidade();
        FacesUtil.addInfoMessage("Entidade removida com sucesso!");
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
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

}
