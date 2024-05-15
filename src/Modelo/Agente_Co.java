/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jeremy
 */
public class Agente_Co {
    private int IDAgente_co;
    private String Nombre;
    private String Telefono;

    public Agente_Co(int IDAgente_co, String Nombre, String Telefono) {
        this.IDAgente_co = IDAgente_co;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public Agente_Co(String Nombre, String Telefono) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
    }

    public int getIDAgente_co() {
        return IDAgente_co;
    }

    public void setIDAgente_co(int IDAgente_co) {
        this.IDAgente_co = IDAgente_co;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

   
}
