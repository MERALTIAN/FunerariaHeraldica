/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.Conexion.Conexion;
import java.sql.CallableStatement;
import java.util.*;
import java.sql.SQLException; 
/**
 *
 * @author Jeremy
 */
public class DAOServicio_Ataud {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="Servicios_listar()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Servicio_Ataud> servicio = new ArrayList();
        
        for (Map registro : registros){
            Servicio_Ataud ser = new Servicio_Ataud((int)registro.get("IDServicio_At"),
                 (String) registro.get("Codigo_de_Modelo"),
                 (int) registro.get("Monto"),   
                 (int) registro.get("IDModelo"), 
                 (int) registro.get("ID_Contrato"));
                 
         servicio.add(ser);
        }
        return servicio;
    }
    public int Insertar (Servicio_Ataud ser) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL insertarServicios(?,?)}");
            st.setString(1, ser.getCodigo_de_Modelo());
            st.setInt(2, ser.getMonto());
            st.executeUpdate();
       
    }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
    }
        conectar.cerrarConexion();
        return 0;
}
    public int Actualizar(Servicio_Ataud ser) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL Servicios_actualizar(?,?,?,?,?)}");
            st.setInt(1, ser.getIDServicio_At());
            st.setString(2, ser.getCodigo_de_Modelo());
            st.setInt(3, ser.getMonto());
            st.setInt(4, ser.getIDModelo());
            st.setInt(5, ser.getID_Contrato());
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
    

