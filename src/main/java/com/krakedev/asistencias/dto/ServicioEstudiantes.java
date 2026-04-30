package com.krakedev.asistencias.dto;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class ServicioEstudiantes {
	
	private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregar(Estudiante estudiante) {
        boolean debeAgregar = true;
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(estudiante.getCedula())) {
                debeAgregar = false;
                break;
            }
        }
        if(debeAgregar == true) {
            estudiantes.add(estudiante);
        }
        estudiantes.contains(estudiante);
    }

    public Estudiante buscarPorCedula(String cedula) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    public void eliminar(String cedula) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
            	estudiantes.remove(e);
            }
        }
    }

    public void actualizar(String cedula, Estudiante nuevo) {
    	for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
            	e.setNombre(nuevo.getNombre());
            	e.setApellido(nuevo.getApellido());
            }
    	}
    	
    	for (int i = 0; i < estudiantes.size(); i++) {
    	    if (estudiantes.get(i).getCedula().equals(cedula)) {
    	        estudiantes.set(i, nuevo);
    	    }
    	}
    }

    public ArrayList<Estudiante> listar(){
        return estudiantes;
    }
}
