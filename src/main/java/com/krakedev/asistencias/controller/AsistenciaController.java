package com.krakedev.asistencias.controller;

import org.springframework.web.bind.annotation.*;

import com.krakedev.asistencias.dto.Asistencia;
import com.krakedev.asistencias.dto.RegistroAsistencia;
import com.krakedev.asistencias.servicios.ServicioAsistencia;

import java.util.ArrayList;

@RestController
@RequestMapping("/asistencias")
public class AsistenciaController {

    private final ServicioAsistencia servicioAsistencia;

    public AsistenciaController(ServicioAsistencia servicioAsistencia) {
        this.servicioAsistencia = servicioAsistencia;
    }

    @PostMapping("/{cedula}")
    public RegistroAsistencia registrar(@PathVariable String cedula) {
        return servicioAsistencia.registrarAsistencia(cedula);
    }

    @GetMapping("/{cedula}")
    public ArrayList<Asistencia> consultar(@PathVariable String cedula) {
        return servicioAsistencia.consultarAsistencia(cedula);
    }
}