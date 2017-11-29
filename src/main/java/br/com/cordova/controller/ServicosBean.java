package br.com.cordova.controller;

import br.com.cordova.model.Servico;
import br.com.cordova.model.dados.StatusServico;
import br.com.cordova.service.ServicoService;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ServicosBean implements Serializable {


    @Inject
    private ServicoService servicoService;

    private Servico servico;
    private List<Servico> servicos;
    private List<Servico> servicosFiltro;


    @PostConstruct
    public void init() {
        servicos = servicoService.listarServicos();
    }

    public void fechar() {
        servico.setStatusServico(StatusServico.FECHADO);
        servicoService.salvar(servico);
    }

    public void entregar() {
        servico.setStatusServico(StatusServico.ENTREGUE);
        servicoService.salvar(servico);
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public List<Servico> getServicosFiltro() {
        return servicosFiltro;
    }

    public void setServicosFiltro(List<Servico> servicosFiltro) {
        this.servicosFiltro = servicosFiltro;
    }
}
