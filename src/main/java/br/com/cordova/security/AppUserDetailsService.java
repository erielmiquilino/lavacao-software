package br.com.cordova.security;

import br.com.cordova.model.Usuario;
import br.com.cordova.service.UsuarioService;
import br.com.cordova.util.cdi.CDIServiceLocator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppUserDetailsService implements UserDetailsService {

	private UsuarioService usuarios = CDIServiceLocator.getBean(UsuarioService.class);
	
	private Usuario usuario;
	private UsuarioSistema user;
	
	private boolean enabled;
	private boolean accountNonExpired;
	private boolean credentialsNonExpired;
	private boolean accountNonLocked; 

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		validaUsuario(email);
		if (usuario != null) {
			user = new UsuarioSistema(usuario, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, getGrupos(usuario));
		} else {
			throw new UsernameNotFoundException("Usuário não encontrado.");
		}
		
		return user;
	}

	
	private void validaUsuario(String email){
		usuario = usuarios.porEmail(email);
		accountNonLocked = true ; 					
		enabled = !usuario.isInativo();
		accountNonExpired = true;
		credentialsNonExpired = true;
		accountNonLocked = true;
	}
	
	


	private Collection<? extends GrantedAuthority> getGrupos(Usuario usuario) {
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + "CLIENTES"));
		return authorities;
	}

}