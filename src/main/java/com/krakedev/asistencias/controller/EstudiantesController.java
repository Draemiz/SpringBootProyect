package com.krakedev.asistencias.controller;

import org.springframework.web.bind.annotation.*;
import com.krakedev.asistencias.dto.Estudiante;
import com.krakedev.asistencias.servicios.ServicioEstudiantes;
import java.util.ArrayList;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {

    private final ServicioEstudiantes servicioEstudiantes;

    public EstudiantesController(ServicioEstudiantes servicioEstudiantes) {
        this.servicioEstudiantes = servicioEstudiantes;
    }

    @PostMapping
    public void agregar(@RequestBody Estudiante estudiante) {
        servicioEstudiantes.agregar(estudiante);
    }

    @GetMapping("/{cedula}")
    public Estudiante buscar(@PathVariable String cedula) {
        return servicioEstudiantes.buscarPorCedula(cedula);
    }

    @DeleteMapping("/{cedula}")
    public void eliminar(@PathVariable String cedula) {
        servicioEstudiantes.eliminar(cedula);
    }

    @PutMapping("/{cedula}")
    public void actualizar(@PathVariable String cedula, @RequestBody Estudiante estudiante) {
        servicioEstudiantes.actualizar(cedula, estudiante);
    }

    @GetMapping
    public ArrayList<Estudiante> listar() {
        return servicioEstudiantes.listar();
    }
}