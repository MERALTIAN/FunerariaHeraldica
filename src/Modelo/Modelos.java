/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jeremy
 */
public class Modelos {
    private int IDModelo;
    private String Nombre;
    private String Modelo;
    private String Medida;
    private String Color;

    public Modelos(int IDModelo, String Nombre, String Modelo, String Medida, String Color) {
        this.IDModelo = IDModelo;
        this.Nombre = Nombre;
        this.Modelo = Modelo;
        this.Medida = Medida;
        this.Color = Color;
    }

    public Modelos(String Nombre, String Modelo, String Medida, String Color) {
        this.Nombre = Nombre;
        this.Modelo = Modelo;
        this.Medida = Medida;
        this.Color = Color;
    }

    public int getIDModelo() {
        return IDModelo;
    }

    public void setIDModelo(int IDModelo) {
        this.IDModelo = IDModelo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMedida() {
        return Medida;
    }

    public void setMedida(String Medida) {
        this.Medida = Medida;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

   
    
    
}
