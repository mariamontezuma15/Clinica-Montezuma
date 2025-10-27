package com.example.ClinicaSpringBootMontezuma.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class TarjetaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tarjeta;
    @Column( nullable = false)
    private String numeroTarjeta;
    @Column( nullable = false)
    private LocalDate fechaExpedicion;
    @Column( nullable = false)
    private LocalDate fechaVencimiento;
    @Column(length = 100, nullable = false)
    private String lugarExpedicion;
    @Column( nullable = false)
    private String categoria;
    @Column( nullable = false)
    private String especialidad;
    @Column( nullable = false)
    private Boolean estado;
    @Column( nullable = false)
    private String nivelFormacion;


    @OneToOne
    @JoinColumn(name = "fk_Medico", referencedColumnName = "Id_medico")
    private Medico medico;

    public TarjetaProfesional() {
    }

    public TarjetaProfesional(Integer id_tarjeta, String numeroTarjeta, LocalDate fechaExpedicion, LocalDate fechaVencimiento, String lugarExpedicion, String categoria, String especialidad, Boolean estado, String nivelFormacion) {
        this.id_tarjeta = id_tarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.lugarExpedicion = lugarExpedicion;
        this.categoria = categoria;
        this.especialidad = especialidad;
        this.estado = estado;
        this.nivelFormacion = nivelFormacion;
    }

    public Integer getId_tarjeta() {
        return id_tarjeta;
    }

    public void setId_tarjeta(Integer id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getNivelFormacion() {
        return nivelFormacion;
    }

    public void setNivelFormacion(String nivelFormacion) {
        this.nivelFormacion = nivelFormacion;
    }
}
