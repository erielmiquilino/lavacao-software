package br.com.cordova.controller;

import br.com.cordova.model.Entidade;
import br.com.cordova.model.EntidadeCarro;
import br.com.cordova.service.EntidadeService;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.io.Serializable;

@Named
@ViewScoped
public class EntidadeBean implements Serializable {


    @Inject
    private EntidadeService entidadeService;


    private Entidade entidade;
    private EntidadeCarro entidadeCarro;

    public void inicializar() {
        entidadeCarro = new EntidadeCarro();
        if(entidade == null) {
            entidade = new Entidade();
        }
    }

    public void salvar() throws IOException {
        entidadeService.salvar(entidade);
        FacesContext.getCurrentInstance().getExternalContext().redirect("/CORDOVA/Sistema/Cadastros/Clientes.xhtml");
    }


    public void incluirCarro() {
        entidadeCarro.setEntidade(entidade);
        entidade.getEntidadeCarros().add(entidadeCarro);
        entidadeCarro = new EntidadeCarro();
    }

    public void excluirCarro(EntidadeCarro entidadeCarro) {
        entidade.getEntidadeCarros().remove(entidadeCarro);
    }

    public void alterarCarro(EntidadeCarro entidadeCarro) {
        this.entidadeCarro = entidadeCarro;
        entidade.getEntidadeCarros().remove(entidadeCarro);
    }


    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public EntidadeCarro getEntidadeCarro() {
        return entidadeCarro;
    }

    public void setEntidadeCarro(EntidadeCarro entidadeCarro) {
        this.entidadeCarro = entidadeCarro;
    }
}
