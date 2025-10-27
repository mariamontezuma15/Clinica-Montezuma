package com.example.ClinicaSpringBootMontezuma.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_HistoriaClinica;

    @Column(nullable = false)
    private LocalDate FechaActual;
    @Column( nullable = false)
    private String motivoConsulta;
    @Column( nullable = false)
    private String diagnostico;
    private String antecedentes;
    private String alergias;
    @Column( nullable = false)
    private String tratamiento;
    private String medicamentos;
    @Column( nullable = false)
    private Long pesoPaciente;
    @Column( nullable = false)
    private Long estaturaPaciente;

    @OneToOne
    @JoinColumn(name = "fk_Paciente", referencedColumnName = "Id_Paciente")
    private Paciente paciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer id_HistoriaClinica, LocalDate fechaActual, String motivoConsulta, String diagnostico, String antecedentes, String alergias, String tratamiento, String medicamentos, Long pesoPaciente, Long estaturaPaciente) {
        Id_HistoriaClinica = id_HistoriaClinica;
        FechaActual = fechaActual;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.antecedentes = antecedentes;
        this.alergias = alergias;
        this.tratamiento = tratamiento;
        this.medicamentos = medicamentos;
        this.pesoPaciente = pesoPaciente;
        this.estaturaPaciente = estaturaPaciente;
    }

    public Integer getId_HistoriaClinica() {
        return Id_HistoriaClinica;
    }

    public void setId_HistoriaClinica(Integer id_HistoriaClinica) {
        Id_HistoriaClinica = id_HistoriaClinica;
    }

    public LocalDate getFechaActual() {
        return FechaActual;
    }

    public void setFechaActual(LocalDate fechaActual) {
        FechaActual = fechaActual;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Long getPesoPaciente() {
        return pesoPaciente;
    }

    public void setPesoPaciente(Long pesoPaciente) {
        this.pesoPaciente = pesoPaciente;
    }

    public Long getEstaturaPaciente() {
        return estaturaPaciente;
    }

    public void setEstaturaPaciente(Long estaturaPaciente) {
        this.estaturaPaciente = estaturaPaciente;
    }
}
