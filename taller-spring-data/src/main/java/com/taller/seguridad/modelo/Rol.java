package com.taller.seguridad.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_ROL")
public class Rol implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private Long id;
	private String rol;
	
	
	private List<UsuarioRol> listaUsuarioRoles;

	public Rol() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secRol")
	@SequenceGenerator(name = "secRol", sequenceName = "SEC_ID_ROL", initialValue = 1, allocationSize = 1)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@OneToMany(mappedBy = "rol", fetch = FetchType.LAZY)
	public List<UsuarioRol> getListaUsuarioRoles() {
		return listaUsuarioRoles;
	}

	public void setListaUsuarioRoles(List<UsuarioRol> listaUsuarioRoles) {
		this.listaUsuarioRoles = listaUsuarioRoles;
	}
	
	

}
