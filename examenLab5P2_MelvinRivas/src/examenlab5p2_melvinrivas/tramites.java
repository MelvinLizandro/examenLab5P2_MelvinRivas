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
public class tramites extends Civiles {
    
    String nombre_tramites;
    String descripcion;
    Date fecha_hecha;

    public tramites() {

    }

    public tramites(String nombre_tramites, String descripcion, Date fecha_hecha, String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento, long identidad) {
        super(nombre, apellido, contraseña, nacimiento, sexo, departamento, identidad);
        this.nombre_tramites = nombre_tramites;
        this.descripcion = descripcion;
        this.fecha_hecha = fecha_hecha;
    }
    
    
    
    
}
