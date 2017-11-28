package br.com.cordova.service;

import br.com.cordova.model.Usuario;
import br.com.cordova.repository.UsuarioRepository;
import br.com.cordova.util.transacional.Transacional;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

public class UsuarioService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioRepository usuarioRepository;

	@Transacional
	public Usuario porEmail(String email) {
		Usuario usuario = usuarioRepository.validaUsuario(email);
		return usuario;
	}

	
	@Transacional
	public void salvar(Usuario usuario) {
		usuarioRepository.salvar(usuario);
	}
	
	
	@Transacional	
	public List<Usuario> listarUsuarios(){
		return usuarioRepository.listarUsuarios();
	}

	public Usuario usuarioPorId(Long parseLong) {
		return usuarioRepository.usuarioPorId(parseLong);
	}
	
}
