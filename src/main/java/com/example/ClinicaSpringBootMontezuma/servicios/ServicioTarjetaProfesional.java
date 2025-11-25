package com.example.ClinicaSpringBootMontezuma.servicios;


import com.example.ClinicaSpringBootMontezuma.modelos.Paciente;
import com.example.ClinicaSpringBootMontezuma.modelos.TarjetaProfesional;
import com.example.ClinicaSpringBootMontezuma.repositorios.ITarjetaProfesionalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioTarjetaProfesional {

    @Autowired
    private ITarjetaProfesionalRepositorio repositorio;

    public TarjetaProfesional guardarTarjeta (TarjetaProfesional datosTarjeta) {

    }
}
