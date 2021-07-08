package com.taller.seguridad.componente.implementacion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.taller.seguridad.componente.ConexionRecurso;

@Component
@Qualifier("ORACLE")
public class ConexionOracle implements ConexionRecurso{

	@Override
	public String obtenerConexion() {
		return "---- Te has conectado con Oracle ---- ";
	}

}
