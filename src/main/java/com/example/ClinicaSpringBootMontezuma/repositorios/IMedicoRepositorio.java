package com.example.ClinicaSpringBootMontezuma.repositorios;

import com.example.ClinicaSpringBootMontezuma.modelos.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepositorio extends JpaRepository<Medico, Integer> {

}
