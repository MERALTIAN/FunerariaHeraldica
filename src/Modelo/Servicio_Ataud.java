/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jeremy
 */
public class Servicio_Ataud {
    private int IDServicio_At;
    private String Codigo_de_Modelo;
    private int Monto;
    private int IDModelo;
    private int ID_Contrato;

    public Servicio_Ataud(int IDServicio_At, String Codigo_de_Modelo, int Monto, int IDModelo, int ID_Contrato) {
        this.IDServicio_At = IDServicio_At;
        this.Codigo_de_Modelo = Codigo_de_Modelo;
        this.Monto = Monto;
        this.IDModelo = IDModelo;
        this.ID_Contrato = ID_Contrato;
    }

    public Servicio_Ataud(String Codigo_de_Modelo, int Monto, int IDModelo, int ID_Contrato) {
        this.Codigo_de_Modelo = Codigo_de_Modelo;
        this.Monto = Monto;
        this.IDModelo = IDModelo;
        this.ID_Contrato = ID_Contrato;
    }

    public int getIDServicio_At() {
        return IDServicio_At;
    }

    public void setIDServicio_At(int IDServicio_At) {
        this.IDServicio_At = IDServicio_At;
    }

    public String getCodigo_de_Modelo() {
        return Codigo_de_Modelo;
    }

    public void setCodigo_de_Modelo(String Codigo_de_Modelo) {
        this.Codigo_de_Modelo = Codigo_de_Modelo;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public int getIDModelo() {
        return IDModelo;
    }

    public void setIDModelo(int IDModelo) {
        this.IDModelo = IDModelo;
    }

    public int getID_Contrato() {
        return ID_Contrato;
    }

    public void setID_Contrato(int ID_Contrato) {
        this.ID_Contrato = ID_Contrato;
    }
   
    

   
}
