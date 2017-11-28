package br.com.cordova.model;

import javax.persistence.*;

@Entity
@Table(name = "entidade_carro")
public class EntidadeCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    private String cor;

    private String placa;

    private String ano;

    @ManyToOne
    @JoinColumn(name = "id_entidade")
    private Entidade entidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadeCarro that = (EntidadeCarro) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (modelo != null ? !modelo.equals(that.modelo) : that.modelo != null) return false;
        if (cor != null ? !cor.equals(that.cor) : that.cor != null) return false;
        return placa != null ? placa.equals(that.placa) : that.placa == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (cor != null ? cor.hashCode() : 0);
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        return result;
    }
}
