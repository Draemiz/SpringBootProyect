package com.krakedev.asistencias.servicios;

import java.util.ArrayList;

import com.krakedev.asistencias.dto.Asistencia;
import com.krakedev.asistencias.dto.RegistroAsistencia;

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
