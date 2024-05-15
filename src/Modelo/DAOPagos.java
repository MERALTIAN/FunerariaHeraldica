/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.Date;

/**
 *
 * @author Jeremy
 */
public class DAOPagos {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="Pagos_listar()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Pagos> Pagos = new ArrayList();
        
        for (Map registro : registros){
            Pagos pag = new Pagos((int)registro.get("IDPagos"),
                    (String) registro.get("Monto"),
                    (Date) registro.get("Fecha"),
                    (int) registro.get("IDAgente_Co"),
                    (int) registro.get("IDContrato"));
         Pagos.add(pag);
        }
        return Pagos;
    }
    public int Insertar (Pagos pag) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL insertarPagos(?,?)}");
            st.setString(1, pag.getMonto_DC());
            st.setDate(2, (Date)pag.getFecha());
            st.executeUpdate();
       
    }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
    }
        conectar.cerrarConexion();
        return 0;
}
    public int Actualizar(Pagos pag) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL Pagos_actualizar(?,?,?,?,?)}");
            st.setInt(1, pag.getIDPagos());
            st.setString(2, pag.getMonto_DC());
            st.setDate(3, (Date)pag.getFecha());
            st.setInt(4, pag.getIDAgente_Co());
            st.setInt(5, pag.getIDContrato());
            st.executeUpdate();
            
        }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
        }
        conectar.cerrarConexion();
        return 0;
    }
    
}
