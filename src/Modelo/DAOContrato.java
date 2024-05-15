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
import java.util.*;
/**
 *
 * @author Jeremy
 */
public class DAOContrato {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="sp_Contrato_listar()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Contrato> Contrato = new ArrayList();
        
        for (Map registro : registros){
            Contrato con = new Contrato((int) registro.get("IDContrato"),
                 (String)  registro.get("Estado"),
                 (String) registro.get("Cantidad_Beneficiarios"),
                 (String) registro.get("Cuotas"),
                 (String) registro.get("Monto"),
                 (int)registro.get("IDcliente"));
         Contrato.add(con);
        }
        return Contrato;
    }
    public int Insertar (Contrato con) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL insertarContrato(?,?,?,?,?)}");
            st.setString(1, con.getEstado());
            st.setString(2, con.getCantidad_Beneficiarios());
            st.setString(3, con.getCuotas());
            st.setString(4, con.getMonto());
            st.setInt(5, con.getIDcliente());
            st.executeUpdate();
       
    }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
    }
        conectar.cerrarConexion();
        return 0;
}
    public int Actualizar(Contrato con) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL Contrato_actualizar(?,?,?,?,?,?)}");
            st.setInt(1, con.getIDContrato());
            st.setString(2, con.getEstado());
            st.setString(3, con.getCantidad_Beneficiarios());
            st.setString(4, con.getCuotas());
            st.setString(5, con.getMonto());
            st.setInt(6, con.getIDcliente());
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
