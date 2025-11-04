package com.example.ClinicaSpringBootMontezuma.repositorios;

import com.example.ClinicaSpringBootMontezuma.modelos.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoriaClinicaRepositorio extends JpaRepository<HistoriaClinica, Integer> {
}
