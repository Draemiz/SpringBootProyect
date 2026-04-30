package com.krakedev.asistencias.dto;

import java.util.ArrayList;

public class ServicioAsistencia {

	private ArrayList<RegistroAsistencia> registros = new ArrayList<>();
	private final ServicioEstudiantes servicioEstudiantes;

	public ServicioAsistencia(ServicioEstudiantes servicioEstudiantes) {
		this.servicioEstudiantes = servicioEstudiantes;
	}

	public RegistroAsistencia registrarAsistencia(String cedula) {
		return null;
	}

	public ArrayList<Asistencia> consultarAsistencia(String cedula) {
		return null;
	}
}
