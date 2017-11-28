package br.com.cordova.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "entidade")
public class Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    private String observacao;

    @NotBlank
    private String telefone;

    private String celular;

    @Email
    private String email;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;

    @OneToMany(targetEntity = EntidadeCarro.class, mappedBy = "entidade", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<EntidadeCarro> entidadeCarros = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<EntidadeCarro> getEntidadeCarros() {
        return entidadeCarros;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setEntidadeCarros(List<EntidadeCarro> entidadeCarros) {
        this.entidadeCarros = entidadeCarros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entidade entidade = (Entidade) o;

        if (id != null ? !id.equals(entidade.id) : entidade.id != null) return false;
        if (nome != null ? !nome.equals(entidade.nome) : entidade.nome != null) return false;
        if (observacao != null ? !observacao.equals(entidade.observacao) : entidade.observacao != null) return false;
        if (telefone != null ? !telefone.equals(entidade.telefone) : entidade.telefone != null) return false;
        if (celular != null ? !celular.equals(entidade.celular) : entidade.celular != null) return false;
        return email != null ? email.equals(entidade.email) : entidade.email == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (observacao != null ? observacao.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
