package com.barberia.model;

import jakarta.persistence.*;

/**
 * Esta clase es la que crea la tabla de clientes en la base de datos.
 * Aquí guardamos toda la info de las personas que vienen a la barbería.
 */
@Entity
@Table(name = "clientes")
public class Cliente {

    // El ID es el número único de cada cliente, se pone solo (autoincrementable)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Estos son los datos básicos que le pedimos al cliente
    private String nombre;
    private String email;
    private String telefono;

    // Constructor vacío: Spring lo necesita para que el proyecto no saque error
    public Cliente() {
    }

    // Este constructor nos sirve para crear un cliente nuevo con sus datos de una vez
    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y Setters: Son las funciones para leer o cambiar la info de cada cliente
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}