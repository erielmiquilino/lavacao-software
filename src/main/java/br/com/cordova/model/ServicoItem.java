package br.com.cordova.model;

import javax.persistence.*;


@Entity
@Table(name = "servico_item")
public class ServicoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_entidade_carro")
    private EntidadeCarro entidadeCarro;

    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico servico;

    @Column(name = "para_choque_traseiro_esquerdo")
    private Boolean paraChoqueTraseiroEsquerdo;

    @Column(name = "para_choque_traseiro_direito")
    private Boolean paraChoqueTraseiroDireito;

    @Column(name = "para_choque_traseiro_meio")
    private Boolean paraChoqueTraseiroMeio;

    @Column(name = "para_choque_dianteiro_esquerdo")
    private Boolean paraChoqueDianteiroEsquerdo;

    @Column(name = "para_choque_dianteiro_direito")
    private Boolean paraChoqueDianteiroDireito;

    @Column(name = "para_choque_dianteiro_meio")
    private Boolean paraChoqueDianteiroMeio;

    @Column(name = "capo_traseiro")
    private Boolean capoTraseiro;

    @Column(name = "capo_dianteiro")
    private Boolean capoDianteiro;

    @Column(name = "porta_dianteira_direita")
    private Boolean portaDianteiraDireita;

    @Column(name = "porta_dianteira_esquerda")
    private Boolean portaDianteiraEsquerda;

    @Column(name = "porta_traseira_direita")
    private Boolean portaTraseiraDireita;

    @Column(name = "porta_traseira_esquerda")
    private Boolean portaTraseiraEsquerda;

    @Column(name = "lateral_esquerda")
    private Boolean lateralEsquerda;

    @Column(name = "lateral_direita")
    private Boolean lateralDireita;

    @Column(name = "farol_esquerdo")
    private Boolean farolEsquerdo;

    @Column(name = "farol_direito")
    private Boolean farolDireito;

    @Column(name = "lanterna_esquerda")
    private Boolean lanternaEsquerda;

    @Column(name = "lanterna_direita")
    private Boolean lanternaDireita;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EntidadeCarro getEntidadeCarro() {
        return entidadeCarro;
    }

    public void setEntidadeCarro(EntidadeCarro entidadeCarro) {
        this.entidadeCarro = entidadeCarro;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Boolean isParaChoqueTraseiroEsquerdo() {
        return paraChoqueTraseiroEsquerdo;
    }

    public void setParaChoqueTraseiroEsquerdo(Boolean paraChoqueTraseiroEsquerdo) {
        this.paraChoqueTraseiroEsquerdo = paraChoqueTraseiroEsquerdo;
    }

    public Boolean isParaChoqueTraseiroDireito() {
        return paraChoqueTraseiroDireito;
    }

    public void setParaChoqueTraseiroDireito(Boolean paraChoqueTraseiroDireito) {
        this.paraChoqueTraseiroDireito = paraChoqueTraseiroDireito;
    }

    public Boolean isParaChoqueTraseiroMeio() {
        return paraChoqueTraseiroMeio;
    }

    public void setParaChoqueTraseiroMeio(Boolean paraChoqueTraseiroMeio) {
        this.paraChoqueTraseiroMeio = paraChoqueTraseiroMeio;
    }

    public Boolean isParaChoqueDianteiroEsquerdo() {
        return paraChoqueDianteiroEsquerdo;
    }

    public void setParaChoqueDianteiroEsquerdo(Boolean paraChoqueDianteiroEsquerdo) {
        this.paraChoqueDianteiroEsquerdo = paraChoqueDianteiroEsquerdo;
    }

    public Boolean isParaChoqueDianteiroDireito() {
        return paraChoqueDianteiroDireito;
    }

    public void setParaChoqueDianteiroDireito(Boolean paraChoqueDianteiroDireito) {
        this.paraChoqueDianteiroDireito = paraChoqueDianteiroDireito;
    }

    public Boolean isParaChoqueDianteiroMeio() {
        return paraChoqueDianteiroMeio;
    }

    public void setParaChoqueDianteiroMeio(Boolean paraChoqueDianteiroMeio) {
        this.paraChoqueDianteiroMeio = paraChoqueDianteiroMeio;
    }

    public Boolean isCapoTraseiro() {
        return capoTraseiro;
    }

    public void setCapoTraseiro(Boolean capoTraseiro) {
        this.capoTraseiro = capoTraseiro;
    }

    public Boolean isCapoDianteiro() {
        return capoDianteiro;
    }

    public void setCapoDianteiro(Boolean capoDianteiro) {
        this.capoDianteiro = capoDianteiro;
    }

    public Boolean isPortaDianteiraDireita() {
        return portaDianteiraDireita;
    }

    public void setPortaDianteiraDireita(Boolean portaDianteiraDireita) {
        this.portaDianteiraDireita = portaDianteiraDireita;
    }

    public Boolean isPortaDianteiraEsquerda() {
        return portaDianteiraEsquerda;
    }

    public void setPortaDianteiraEsquerda(Boolean portaDianteiraEsquerda) {
        this.portaDianteiraEsquerda = portaDianteiraEsquerda;
    }

    public Boolean isPortaTraseiraDireita() {
        return portaTraseiraDireita;
    }

    public void setPortaTraseiraDireita(Boolean portaTraseiraDireita) {
        this.portaTraseiraDireita = portaTraseiraDireita;
    }

    public Boolean isPortaTraseiraEsquerda() {
        return portaTraseiraEsquerda;
    }

    public void setPortaTraseiraEsquerda(Boolean portaTraseiraEsquerda) {
        this.portaTraseiraEsquerda = portaTraseiraEsquerda;
    }

    public Boolean isLateralEsquerda() {
        return lateralEsquerda;
    }

    public void setLateralEsquerda(Boolean lateralEsquerda) {
        this.lateralEsquerda = lateralEsquerda;
    }

    public Boolean isLateralDireita() {
        return lateralDireita;
    }

    public void setLateralDireita(Boolean lateralDireita) {
        this.lateralDireita = lateralDireita;
    }

    public Boolean isFarolEsquerdo() {
        return farolEsquerdo;
    }

    public void setFarolEsquerdo(Boolean farolEsquerdo) {
        this.farolEsquerdo = farolEsquerdo;
    }

    public Boolean isFarolDireito() {
        return farolDireito;
    }

    public void setFarolDireito(Boolean farolDireito) {
        this.farolDireito = farolDireito;
    }

    public Boolean isLanternaEsquerda() {
        return lanternaEsquerda;
    }

    public void setLanternaEsquerda(Boolean lanternaEsquerda) {
        this.lanternaEsquerda = lanternaEsquerda;
    }

    public Boolean isLanternaDireita() {
        return lanternaDireita;
    }

    public void setLanternaDireita(Boolean lanternaDireita) {
        this.lanternaDireita = lanternaDireita;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServicoItem that = (ServicoItem) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (entidadeCarro != null ? !entidadeCarro.equals(that.entidadeCarro) : that.entidadeCarro != null)
            return false;
        if (servico != null ? !servico.equals(that.servico) : that.servico != null) return false;
        if (paraChoqueTraseiroEsquerdo != null ? !paraChoqueTraseiroEsquerdo.equals(that.paraChoqueTraseiroEsquerdo) : that.paraChoqueTraseiroEsquerdo != null)
            return false;
        if (paraChoqueTraseiroDireito != null ? !paraChoqueTraseiroDireito.equals(that.paraChoqueTraseiroDireito) : that.paraChoqueTraseiroDireito != null)
            return false;
        if (paraChoqueTraseiroMeio != null ? !paraChoqueTraseiroMeio.equals(that.paraChoqueTraseiroMeio) : that.paraChoqueTraseiroMeio != null)
            return false;
        if (paraChoqueDianteiroEsquerdo != null ? !paraChoqueDianteiroEsquerdo.equals(that.paraChoqueDianteiroEsquerdo) : that.paraChoqueDianteiroEsquerdo != null)
            return false;
        if (paraChoqueDianteiroDireito != null ? !paraChoqueDianteiroDireito.equals(that.paraChoqueDianteiroDireito) : that.paraChoqueDianteiroDireito != null)
            return false;
        if (paraChoqueDianteiroMeio != null ? !paraChoqueDianteiroMeio.equals(that.paraChoqueDianteiroMeio) : that.paraChoqueDianteiroMeio != null)
            return false;
        if (capoTraseiro != null ? !capoTraseiro.equals(that.capoTraseiro) : that.capoTraseiro != null) return false;
        if (capoDianteiro != null ? !capoDianteiro.equals(that.capoDianteiro) : that.capoDianteiro != null)
            return false;
        if (portaDianteiraDireita != null ? !portaDianteiraDireita.equals(that.portaDianteiraDireita) : that.portaDianteiraDireita != null)
            return false;
        if (portaDianteiraEsquerda != null ? !portaDianteiraEsquerda.equals(that.portaDianteiraEsquerda) : that.portaDianteiraEsquerda != null)
            return false;
        if (portaTraseiraDireita != null ? !portaTraseiraDireita.equals(that.portaTraseiraDireita) : that.portaTraseiraDireita != null)
            return false;
        if (portaTraseiraEsquerda != null ? !portaTraseiraEsquerda.equals(that.portaTraseiraEsquerda) : that.portaTraseiraEsquerda != null)
            return false;
        if (lateralEsquerda != null ? !lateralEsquerda.equals(that.lateralEsquerda) : that.lateralEsquerda != null)
            return false;
        if (lateralDireita != null ? !lateralDireita.equals(that.lateralDireita) : that.lateralDireita != null)
            return false;
        if (farolEsquerdo != null ? !farolEsquerdo.equals(that.farolEsquerdo) : that.farolEsquerdo != null)
            return false;
        if (farolDireito != null ? !farolDireito.equals(that.farolDireito) : that.farolDireito != null) return false;
        if (lanternaEsquerda != null ? !lanternaEsquerda.equals(that.lanternaEsquerda) : that.lanternaEsquerda != null)
            return false;
        return lanternaDireita != null ? lanternaDireita.equals(that.lanternaDireita) : that.lanternaDireita == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (entidadeCarro != null ? entidadeCarro.hashCode() : 0);
        result = 31 * result + (servico != null ? servico.hashCode() : 0);
        result = 31 * result + (paraChoqueTraseiroEsquerdo != null ? paraChoqueTraseiroEsquerdo.hashCode() : 0);
        result = 31 * result + (paraChoqueTraseiroDireito != null ? paraChoqueTraseiroDireito.hashCode() : 0);
        result = 31 * result + (paraChoqueTraseiroMeio != null ? paraChoqueTraseiroMeio.hashCode() : 0);
        result = 31 * result + (paraChoqueDianteiroEsquerdo != null ? paraChoqueDianteiroEsquerdo.hashCode() : 0);
        result = 31 * result + (paraChoqueDianteiroDireito != null ? paraChoqueDianteiroDireito.hashCode() : 0);
        result = 31 * result + (paraChoqueDianteiroMeio != null ? paraChoqueDianteiroMeio.hashCode() : 0);
        result = 31 * result + (capoTraseiro != null ? capoTraseiro.hashCode() : 0);
        result = 31 * result + (capoDianteiro != null ? capoDianteiro.hashCode() : 0);
        result = 31 * result + (portaDianteiraDireita != null ? portaDianteiraDireita.hashCode() : 0);
        result = 31 * result + (portaDianteiraEsquerda != null ? portaDianteiraEsquerda.hashCode() : 0);
        result = 31 * result + (portaTraseiraDireita != null ? portaTraseiraDireita.hashCode() : 0);
        result = 31 * result + (portaTraseiraEsquerda != null ? portaTraseiraEsquerda.hashCode() : 0);
        result = 31 * result + (lateralEsquerda != null ? lateralEsquerda.hashCode() : 0);
        result = 31 * result + (lateralDireita != null ? lateralDireita.hashCode() : 0);
        result = 31 * result + (farolEsquerdo != null ? farolEsquerdo.hashCode() : 0);
        result = 31 * result + (farolDireito != null ? farolDireito.hashCode() : 0);
        result = 31 * result + (lanternaEsquerda != null ? lanternaEsquerda.hashCode() : 0);
        result = 31 * result + (lanternaDireita != null ? lanternaDireita.hashCode() : 0);
        return result;
    }
}
