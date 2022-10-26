/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto003;

/**
 *
 * @author LAB-2
 */
public class DirectorTecnico extends Persona {

    private String nacionalidad;
    private int yearsTrayectoria;

    
     public String mostrarInfoDirector() {
        return this.mostrarInfo() + " es de nacionalidad: " + this.nacionalidad
                + " y tiene: " + this.getYearsTrayectoria()+" años de trayectoria";
    }

    public void setNacionalidad(String n) {
        this.nacionalidad = n;
    }

    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getYearsTrayectoria() {
        return yearsTrayectoria;
    }

}