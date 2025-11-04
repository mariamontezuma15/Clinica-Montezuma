package com.example.ClinicaSpringBootMontezuma.repositorios;

import com.example.ClinicaSpringBootMontezuma.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepoitorio extends JpaRepository<Paciente,Integer > {
}
