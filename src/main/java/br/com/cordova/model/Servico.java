package br.com.cordova.model;

import br.com.cordova.model.dados.StatusServico;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_servico")
    private StatusServico statusServico;

    @Column(length = 10)
    private String prisma;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private Entidade entidade;

    private String dependente;

    private String observacao;

    private LocalDateTime data;

    private Boolean pago;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true,cascade = CascadeType.ALL,mappedBy = "servico", targetEntity = ServicoItem.class)
    private List<ServicoItem> servicoItems = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StatusServico getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(StatusServico statusServico) {
        this.statusServico = statusServico;
    }

    public String getPrisma() {
        return prisma;
    }

    public void setPrisma(String prisma) {
        this.prisma = prisma;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getDependente() {
        return dependente;
    }

    public void setDependente(String dependente) {
        this.dependente = dependente;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public List<ServicoItem> getServicoItems() {
        return servicoItems;
    }

    public void setServicoItems(List<ServicoItem> servicoItems) {
        this.servicoItems = servicoItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Servico servico = (Servico) o;

        return id != null ? id.equals(servico.id) : servico.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
