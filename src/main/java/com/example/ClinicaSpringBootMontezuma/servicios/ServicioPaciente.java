package com.example.ClinicaSpringBootMontezuma.servicios;

import com.example.ClinicaSpringBootMontezuma.modelos.Paciente;
import com.example.ClinicaSpringBootMontezuma.repositorios.IPacienteRepoitorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ServicioPaciente {

    @Autowired//inyecta dependencia
    private IPacienteRepoitorio repositorio;

    //metodo (Servicio web) para guadar un paciewnte en BD

    public Paciente guardarPaciente(Paciente datosPaciente) {
        //validar datos de entrada
        if(datosPaciente.getNombre() == null || datosPaciente.getNombre() == "" || datosPaciente.getNombre().length()<4){
            throw  new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "El nombre ingresado no cumple con los criterios de nuestro servicio "
            );
        }
    return this.repositorio.save(datosPaciente);
    }

}
