package com.example.ClinicaSpringBootMontezuma.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Paciente;

    @Column(length = 20, nullable = false)
    private String tipoDocumento;
    @Column(length = 20, nullable = false, unique = true)
    private String documento;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private LocalDate fechaNacimiento;
    @Column(length = 10,nullable = false)
    private String sexo;
    @Column(length = 5, nullable = false)
    private String grupoSangineo;
    @Column(length = 100,nullable = false)
    private String eps;
    @Column(nullable = false)
    private Boolean esActivo;
    @Column(unique = true)
    private String correo;

    @OneToOne (mappedBy = "paciente")
    private HistoriaClinica historiaClinica;

    public Paciente() {
    }

    public Paciente(Integer id_Paciente, String tipoDocumento, String documento, String nombre, LocalDate fechaNacimiento, String sexo, String grupoSangineo, String eps, Boolean esActivo, String correo) {
        Id_Paciente = id_Paciente;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.grupoSangineo = grupoSangineo;
        this.eps = eps;
        this.esActivo = esActivo;
        this.correo = correo;
    }

    public Integer getId_Paciente() {
        return Id_Paciente;
    }

    public void setId_Paciente(Integer id_Paciente) {
        Id_Paciente = id_Paciente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSangineo() {
        return grupoSangineo;
    }

    public void setGrupoSangineo(String grupoSangineo) {
        this.grupoSangineo = grupoSangineo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public Boolean getEsActivo() {
        return esActivo;
    }

    public void setEsActivo(Boolean esActivo) {
        this.esActivo = esActivo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

