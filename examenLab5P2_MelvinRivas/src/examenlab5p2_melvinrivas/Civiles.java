/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_melvinrivas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author l3306
 */
public class Civiles extends Usuarios {
    
    ArrayList tramites = new ArrayList();

    public Civiles() {
        
    }

    public Civiles(String nombre, String apellido, int contraseña, Date nacimiento, String sexo, String departamento, String identidad) {
        super(nombre, apellido, contraseña, nacimiento, sexo, departamento, identidad);
    }
    

    public ArrayList getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "Civiles{" + "tramites=" + tramites + '}';
    }
    
    
    
}
