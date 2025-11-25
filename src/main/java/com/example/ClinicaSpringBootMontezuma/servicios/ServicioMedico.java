package com.example.ClinicaSpringBootMontezuma.servicios;

import com.example.ClinicaSpringBootMontezuma.modelos.Medico;
import com.example.ClinicaSpringBootMontezuma.modelos.Paciente;
import com.example.ClinicaSpringBootMontezuma.repositorios.IMedicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {

    @Autowired
    private IMedicoRepositorio repositorio;

    public Medico guardarMedico(Medico datosMedico) {

    }
}
