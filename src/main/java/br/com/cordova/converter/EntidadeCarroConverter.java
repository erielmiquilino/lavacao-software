package br.com.cordova.converter;

import br.com.cordova.model.Entidade;
import br.com.cordova.model.EntidadeCarro;
import br.com.cordova.service.EntidadeService;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class EntidadeCarroConverter implements Converter{

    @Inject
    private EntidadeService entidadeService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            return entidadeService.entidadeCarroPorId(Long.parseLong(value));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        try {
            return String.valueOf(((EntidadeCarro) value).getId());
        } catch (Exception e) {
            return "";
        }
    }

}
