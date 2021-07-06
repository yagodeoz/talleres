package com.taller.seguridad.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.taller.seguridad.modelo.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

	@Query(value = "select * from TAB_USUARIOS where USUARIO like :criterio ", nativeQuery = true)
	List<Usuario> obtenerUsuarios(@Param(value = "criterio") String criterio);

}
