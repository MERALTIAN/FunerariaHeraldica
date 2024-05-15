/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;
/**
 *
 * @author Jeremy
 */
public class Pagos {
    private int IDPagos;
    private String Monto_DC;
    private Date Fecha;
    private int IDAgente_Co;
    private int IDContrato;

    public Pagos(int IDPagos, String Monto_DC, Date Fecha, int IDAgente_Co, int IDContrato) {
        this.IDPagos = IDPagos;
        this.Monto_DC = Monto_DC;
        this.Fecha = Fecha;
        this.IDAgente_Co = IDAgente_Co;
        this.IDContrato = IDContrato;
    }

    public Pagos(String Monto_DC, Date Fecha, int IDAgente_Co, int IDContrato) {
        this.Monto_DC = Monto_DC;
        this.Fecha = Fecha;
        this.IDAgente_Co = IDAgente_Co;
        this.IDContrato = IDContrato;
    }

    public int getIDPagos() {
        return IDPagos;
    }

    public void setIDPagos(int IDPagos) {
        this.IDPagos = IDPagos;
    }

    public String getMonto_DC() {
        return Monto_DC;
    }

    public void setMonto_DC(String Monto_DC) {
        this.Monto_DC = Monto_DC;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIDAgente_Co() {
        return IDAgente_Co;
    }

    public void setIDAgente_Co(int IDAgente_Co) {
        this.IDAgente_Co = IDAgente_Co;
    }

    public int getIDContrato() {
        return IDContrato;
    }

    public void setIDContrato(int IDContrato) {
        this.IDContrato = IDContrato;
    }

    
}