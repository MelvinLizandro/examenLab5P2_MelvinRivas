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
public class Empleados extends Usuarios{
    
    String carrera;
    String puesto_laboral;
    int años_laborados;

    public Empleados() {

    }

    public Empleados(String carrera, String puesto_laboral, int años_laborados, String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento, String identidad) {
        super(nombre, apellido, contraseña, nacimiento, sexo, departamento, identidad);
        this.carrera = carrera;
        this.puesto_laboral = puesto_laboral;
        this.años_laborados = años_laborados;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto_laboral() {
        return puesto_laboral;
    }

    public void setPuesto_laboral(String puesto_laboral) {
        this.puesto_laboral = puesto_laboral;
    }

    public int getAños_laborados() {
        return años_laborados;
    }

    public void setAños_laborados(int años_laborados) {
        this.años_laborados = años_laborados;
    }

    @Override
    public String toString() {
        
        return super.toString() + "Empleados{" + "carrera=" + carrera + ", puesto_laboral=" + puesto_laboral + ", a\u00f1os_laborados=" + años_laborados + '}';
    }
     
    
}

