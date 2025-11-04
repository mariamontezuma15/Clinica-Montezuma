🏥 Proyecto: Clínica Montezuma — Sistema de Historia Clínica
📋 Descripción General

Este proyecto es un sistema de gestión clínica desarrollado con Spring Boot y JPA (Hibernate) que permite manejar la información de pacientes, médicos, historias clínicas y tarjetas profesionales.

El objetivo principal es almacenar, consultar y administrar los datos médicos de forma estructurada, asegurando integridad y consistencia entre las entidades relacionadas.

🧩 Entidades del Modelo
🩺 HistoriaClinica

Representa el registro médico del paciente, con información sobre el diagnóstico, tratamiento y datos físicos.

Atributos principales:

Id_HistoriaClinica: Identificador único.

FechaActual: Fecha de la historia clínica.

motivoConsulta: Razón de la visita médica.

diagnostico: Diagnóstico del médico.

antecedentes: Antecedentes médicos relevantes.

alergias: Alergias del paciente.

tratamiento: Plan de tratamiento.

medicamentos: Medicamentos recetados.

pesoPaciente: Peso del paciente.

estaturaPaciente: Estatura del paciente.

Relación:

@OneToOne con Paciente (cada paciente tiene una historia clínica).

👨‍⚕️ Medico

Contiene los datos del personal médico registrado en el sistema.

Atributos principales:

Id_medico: Identificador único del médico.

nombre: Nombre completo del médico.

tipoDocumento: Tipo de documento (CC, CE, etc.).

documento: Número de documento (único).

especialidad: Especialidad médica.

correo: Correo electrónico.

añosExperiencia: Años de experiencia.

salario: Salario del médico.

tipoContrato: Tipo de contrato laboral.

telefono: Teléfono de contacto.

Relación:

@OneToOne(mappedBy = "medico") con TarjetaProfesional.

🧍‍♀️ Paciente

Representa los datos básicos de los pacientes atendidos en la clínica.

Atributos principales:

Id_Paciente: Identificador único.

tipoDocumento: Tipo de documento (CC, TI, etc.).

documento: Número de documento (único).

nombre: Nombre completo.

fechaNacimiento: Fecha de nacimiento.

sexo: Sexo del paciente.

grupoSangineo: Grupo sanguíneo.

eps: EPS a la que pertenece.

esActivo: Indica si el paciente está activo.

correo: Correo electrónico (único).

Relación:

@OneToOne(mappedBy = "paciente") con HistoriaClinica.

🪪 TarjetaProfesional

Contiene los datos de la tarjeta profesional del médico.

Atributos principales:

id_tarjeta: Identificador único.

numeroTarjeta: Número de la tarjeta profesional.

fechaExpedicion: Fecha de expedición.

fechaVencimiento: Fecha de vencimiento.

lugarExpedicion: Ciudad donde fue expedida.

categoria: Categoría profesional.

especialidad: Especialidad médica.

estado: Estado activo o inactivo.

nivelFormacion: Nivel de formación académica.

Relación:

@OneToOne con Medico mediante la clave foránea fk_Medico.


🧠 Buenas Prácticas

Cada entidad tiene:

Constructor vacío.

Constructor con todos los campos.

Getters y setters generados.

Uso de @Column(nullable = false) para campos obligatorios.

Uso de unique = true en campos que no pueden repetirse (como documento y correo).

Relaciones mapeadas correctamente con @OneToOne y @JoinColumn.
