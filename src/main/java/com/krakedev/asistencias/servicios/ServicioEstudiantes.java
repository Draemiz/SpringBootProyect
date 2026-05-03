package com.krakedev.asistencias.servicios;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.krakedev.asistencias.dto.Estudiante;

@Service
public class ServicioEstudiantes {

    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregar(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(estudiante.getCedula())) {
                return;
            }
        }
        estudiantes.add(estudiante);
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
        estudiantes.removeIf(e -> e.getCedula().equals(cedula));
    }

    public void actualizar(String cedula, Estudiante nuevo) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
                e.setNombre(nuevo.getNombre());
                e.setApellido(nuevo.getApellido());
            }
        }
    }

    public ArrayList<Estudiante> listar() {
        return estudiantes;
    }
}