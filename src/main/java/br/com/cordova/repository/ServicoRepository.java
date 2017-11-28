package br.com.cordova.repository;

import br.com.cordova.model.Servico;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public class ServicoRepository implements Serializable {

    @Inject
    private EntityManager entityManager;

    public void salvar(Servico servico) {
        entityManager.merge(servico);
    }

    public Servico buscarPorId(Long id) {
        return entityManager.find(Servico.class, id);
    }

    public List<Servico> listarServicos() {
        return entityManager.createQuery("SELECT s FROM Servico s ORDER BY s.id", Servico.class).getResultList();
    }
}
