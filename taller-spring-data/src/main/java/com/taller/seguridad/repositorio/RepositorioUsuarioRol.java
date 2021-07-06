package com.taller.seguridad.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taller.seguridad.modelo.UsuarioRol;

@Repository
public interface RepositorioUsuarioRol extends JpaRepository<UsuarioRol, Long> {

}
