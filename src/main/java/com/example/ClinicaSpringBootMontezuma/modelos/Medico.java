package com.example.ClinicaSpringBootMontezuma.modelos;

import jakarta.persistence.*;

@Entity
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_medico;

    @Column( nullable = false)
    private String nombre;
    @Column(length = 20, nullable = false)
    private String tipoDocumento;
    @Column(length = 20, nullable = false, unique = true)
    private String documento;
    @Column( nullable = false)
    private String especialidad;
    private String correo;
    @Column( nullable = false)
    private Integer añosExperiencia ;
    @Column( nullable = false)
    private Long salario;
    @Column( nullable = false)
    private String tipoContrato;
    @Column( nullable = false)
    private String telefono;

    @OneToOne (mappedBy = "medico")
    private TarjetaProfesional tarjetaProfesional;

    public Medico() {
    }

    public Medico(Integer id_medico, String nombre, String tipoDocumento, String documento, String especialidad, String correo, Integer añosExperiencia, Long salario, String tipoContrato, String telefono) {
        Id_medico = id_medico;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.especialidad = especialidad;
        this.correo = correo;
        this.añosExperiencia = añosExperiencia;
        this.salario = salario;
        this.tipoContrato = tipoContrato;
        this.telefono = telefono;
    }

    public Integer getId_medico() {
        return Id_medico;
    }

    public void setId_medico(Integer id_medico) {
        Id_medico = id_medico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Integer añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
