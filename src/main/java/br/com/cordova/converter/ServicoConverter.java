package br.com.cordova.converter;

import br.com.cordova.model.Servico;
import br.com.cordova.service.ServicoService;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ServicoConverter implements Converter {

    @Inject
    private ServicoService servicoService;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        try {
            return servicoService.buscarPorId(Long.parseLong(value));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        try {
            return String.valueOf(((Servico) value).getId());
        } catch (Exception e) {
            return "";
        }
    }

}
