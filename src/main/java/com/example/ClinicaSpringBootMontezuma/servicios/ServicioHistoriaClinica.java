package com.example.ClinicaSpringBootMontezuma.servicios;


import com.example.ClinicaSpringBootMontezuma.modelos.HistoriaClinica;
import com.example.ClinicaSpringBootMontezuma.modelos.Paciente;
import com.example.ClinicaSpringBootMontezuma.repositorios.IHistoriaClinicaRepositorio;
import com.example.ClinicaSpringBootMontezuma.repositorios.IMedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioHistoriaClinica {

    @Autowired
    private IHistoriaClinicaRepositorio repositorio;

    public HistoriaClinica guardarHistorial(HistoriaClinica datosHistorial) {

    }
}
