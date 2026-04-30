package com.krakedev.asistencias.dto;

public class RegistroAsistencia {
	private Estudiante estudiante;
	private Asistencia asistencia;
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Asistencia getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}
	@Override
	public String toString() {
		return "RegistroAsistencia [estudiante=" + estudiante + ", asistencia=" + asistencia + ", getEstudiante()="
				+ getEstudiante() + ", getAsistencia()=" + getAsistencia() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
