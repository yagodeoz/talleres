package com.taller.seguridad.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.taller.seguridad.modelo.Rol;

@Repository
public interface RepositorioRol extends JpaRepository<Rol, Long> {

	@Query(value = "select * from tab_rol where id in (  select b.id_rol from TAB_USUARIO_ROl b, TAB_USUARIOS a "
			+ "			where a.usuario = :pUsuario and b.id_usuario = a.id  )", nativeQuery = true)
	List<Rol> obtenerRolPorUsuario(@Param(value = "pUsuario") String nombreUsuario);

}
