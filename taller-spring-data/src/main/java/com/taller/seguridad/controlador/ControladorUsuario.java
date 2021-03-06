package com.taller.seguridad.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taller.seguridad.modelo.Usuario;
import com.taller.seguridad.servicio.ServicioSeguridad;

//CRUST, SOLID, 
@RestController
@RequestMapping("/api") // http://127.0.0.1:9998/api
public class ControladorUsuario {

	@Autowired
	private ServicioSeguridad servicioSeguridad;

	@GetMapping("/usuarios")
	public List<Usuario> obtenerUsuarios() {
		return servicioSeguridad.obtenerUsuarios();
	}

	@GetMapping("/conexion/{tipo}")
	public String obntenerConexion(@PathVariable String tipo) {
		return servicioSeguridad.obtenerObjetoConexion(tipo);
	}

	@GetMapping("/usuarios/{criterio}")
	public List<Usuario> obtenerUsuarios(@PathVariable String criterio) {
		return servicioSeguridad.obtenerUsuarios(criterio);
	}

	@PostMapping("/usuario")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return servicioSeguridad.guardarUsuario(usuario);
	}

	@PutMapping("/usuario")
	public Usuario actulizarUsuario(@RequestBody Usuario usuario) {
		return servicioSeguridad.guardarUsuario(usuario);
	}

	@DeleteMapping("/usuario/{id}")
	public String eliminarUsuario(@PathVariable Long id) {
		return servicioSeguridad.eliminarUsuario(id);
	}

}
