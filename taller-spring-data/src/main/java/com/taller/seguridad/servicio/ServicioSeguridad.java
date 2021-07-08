package com.taller.seguridad.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.taller.seguridad.componente.ConexionRecurso;
import com.taller.seguridad.modelo.Rol;
import com.taller.seguridad.modelo.Usuario;
import com.taller.seguridad.modelo.UsuarioRol;
import com.taller.seguridad.repositorio.RepositorioRol;
import com.taller.seguridad.repositorio.RepositorioUsuario;
import com.taller.seguridad.repositorio.RepositorioUsuarioRol;

@Service
public class ServicioSeguridad {

	@Autowired
	private RepositorioRol repRol;

	@Autowired
	private RepositorioUsuario repUsuario;

	@Autowired
	private RepositorioUsuarioRol repUsuarioRol;

	@Autowired
	@Qualifier("ORACLE")
	ConexionRecurso connn;

	@Autowired
	@Qualifier("MYSQL")
	ConexionRecurso connn2;
	
	@Autowired
	@Qualifier("POSTGRESQL")
	ConexionRecurso connn3;
	

	public List<Rol> obtenerRolesUsuario(String nombreUsuario) {
		return repRol.obtenerRolPorUsuario(nombreUsuario);
	}

	public Usuario guardarUsuario(Usuario usuario) {
		return repUsuario.save(usuario);
	}

	public Rol guardarRol(Rol rol) {
		return repRol.save(rol);
	}

	public UsuarioRol guardarUsuarioRol(UsuarioRol usuarioRol) {
		return repUsuarioRol.save(usuarioRol);
	}

	public List<Usuario> obtenerUsuarios() {
		return repUsuario.findAll();
	}

	public List<Usuario> obtenerUsuarios(String criterio) {

		return repUsuario.obtenerUsuarios("%" + criterio + "%");
	}

	public Optional<Usuario> buscarUsuarioId(Long id) {
		return repUsuario.findById(id);
	}

	public void eliminarUsuario(Usuario usr) {
		repUsuario.delete(usr);
	}

	public String eliminarUsuario(Long id) {
		Optional<Usuario> usuario = buscarUsuarioId(id);
		if (usuario.isEmpty())
			return "El usuario con id " + id + ", no existe";
		Usuario usr = usuario.get();
		eliminarUsuario(usr);
		return "Usuario eliminado correctamente";
	}

	public String obtenerObjetoConexion(String tipo) {
		String resultado = "";
		switch (tipo) {
		case "O":
			resultado = connn.obtenerConexion();
			break;
		case "M":
			resultado = connn2.obtenerConexion();
			break;
		case "P":
			resultado = connn3.obtenerConexion();
		default:
			break;
		}

		return resultado;
	}

}
