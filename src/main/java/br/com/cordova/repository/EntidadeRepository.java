package br.com.cordova.repository;

import br.com.cordova.model.Entidade;
import br.com.cordova.model.EntidadeCarro;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.io.Serializable;
import java.util.List;

public class EntidadeRepository implements Serializable{

    @Inject
    private EntityManager manager;

    public Entidade salvar(Entidade cliente){
        return manager.merge(cliente);
    }

    public void excluir(Entidade cliente){
        Object objetoCliente = manager.merge(cliente);
        manager.remove(objetoCliente);
    }

    public List<Entidade> listarEntidades(){
        TypedQuery<Entidade> selectQuery = manager.createQuery("SELECT e FROM Entidade e ORDER BY e.id", Entidade.class);

        return selectQuery.getResultList();
    }

    public Entidade entidadePorId(Long id){
        return manager.find(Entidade.class, id);
    }


    public EntidadeCarro entidadeCarroPorId(Long id) {
        return manager.find(EntidadeCarro.class, id);
    }
}
