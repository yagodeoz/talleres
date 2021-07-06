package com.taller.seguridad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallerJPA {// implements CommandLineRunner {

	/*
	 * @Autowired private ServicioSeguridad servicioSeguridad;
	 */
	public static void main(String[] args) {
		SpringApplication.run(TallerJPA.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * Usuario usuario = new Usuario();
	 * 
	 * usuario.setClave("ADMIN"); usuario.setNombreUsuario("ADMIN");
	 * 
	 * usuario = servicioSeguridad.guardarUsuario(usuario);
	 * 
	 * Rol rol = new Rol(); rol.setRol("AD-ADMIN"); rol =
	 * servicioSeguridad.guardarRol(rol);
	 * 
	 * UsuarioRol usuarioRol = new UsuarioRol(); usuarioRol.setRol(rol);
	 * usuarioRol.setUsuario(usuario);
	 * 
	 * servicioSeguridad.guardarUsuarioRol(usuarioRol);
	 * 
	 * List<Rol> listaRoles = servicioSeguridad.obtenerRolesUsuario("ADMIN");
	 * 
	 * listaRoles.forEach(r -> System.out.println(r.getRol()));
	 * 
	 * }
	 */

}
