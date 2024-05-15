/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jeremy
 */
public class Beneficiario {
    private int IDBeneficiarios;
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Telefono;
    private int IDContratos;

    public Beneficiario(int IDBeneficiarios, String par1, String par2, String par3, String par4, int par5) {
        this.IDBeneficiarios = IDBeneficiarios;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.IDContratos = IDContratos;
    }

    public Beneficiario(String Nombre, String Apellido, String Cedula, String Telefono, int parseInt) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.IDContratos = IDContratos;
    }

    

    public int getIDBeneficiarios() {
        return IDBeneficiarios;
    }

    public void setIDBeneficiarios(int IDBeneficiarios) {
        this.IDBeneficiarios = IDBeneficiarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getIDContratos() {
        return IDContratos;
    }

    public void setIDContratos(int IDContratos) {
        this.IDContratos = IDContratos;
    }

    
}
