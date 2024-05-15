/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Jeremy
 */
public class Contrato {
      public int IDContrato;
  public String Estado;
  public String Cantidad_Beneficiarios;
  public String Cuotas;
  public String Monto;
  public int IDcliente;

    public Contrato(int IDContrato, String Estado, String Cantidad_Beneficiarios, String Cuotas, String Monto, int IDcliente) {
        this.IDContrato = IDContrato;
        this.Estado = Estado;
        this.Cantidad_Beneficiarios = Cantidad_Beneficiarios;
        this.Cuotas = Cuotas;
        this.Monto = Monto;
        this.IDcliente = IDcliente;
    }

    public Contrato(String Estado, String Cantidad_Beneficiarios, String Cuotas, String Monto, int IDcliente) {
        this.Estado = Estado;
        this.Cantidad_Beneficiarios = Cantidad_Beneficiarios;
        this.Cuotas = Cuotas;
        this.Monto = Monto;
        this.IDcliente = IDcliente;
    }

    public int getIDContrato() {
        return IDContrato;
    }

    public void setIDContrato(int IDContrato) {
        this.IDContrato = IDContrato;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCantidad_Beneficiarios() {
        return Cantidad_Beneficiarios;
    }

    public void setCantidad_Beneficiarios(String Cantidad_Beneficiarios) {
        this.Cantidad_Beneficiarios = Cantidad_Beneficiarios;
    }

    public String getCuotas() {
        return Cuotas;
    }

    public void setCuotas(String Cuotas) {
        this.Cuotas = Cuotas;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

    public int getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(int IDcliente) {
        this.IDcliente = IDcliente;
    }
  
  
}
