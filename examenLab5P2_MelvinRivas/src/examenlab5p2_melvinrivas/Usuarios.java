/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_melvinrivas;

import java.util.Date;

/**
 *
 * @author l3306
 */
public class Usuarios {
    
    String nombre;
    String apellido;
    int contraseña;
    Date nacimiento;
    String sexo;
    String departamento;
    String identidad;
    

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento, String identidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.departamento = departamento;
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    @Override
    public String toString() {
        return "Usuarios{" + " nombre: " + nombre + ", apellido: " + apellido + ", contrase\u00f1a: " + contraseña + ", nacimiento: " + nacimiento + ", sexo: " + sexo + ", departamento: " + departamento + ", identidad: " + identidad + '}';
    }
    
}
