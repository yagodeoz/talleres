package com.taller.seguridad.configuracion;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taller.seguridad.componente.ConexionRecurso;

@Configuration
public class Config {
	@Bean
	@Qualifier("POSTGRESQL")
	public ConexionRecurso obtenerRecursoMysql() {

		return new ConexionRecurso() {
			@Override
			public String obtenerConexion() {
				return "... Te has Conectado con Postgresql ...";
			}
		};
	}
}

//BEAN + ANOTACION = Managed Bean