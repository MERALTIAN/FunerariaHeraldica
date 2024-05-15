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
public class DAOAgente {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="sp_Agente_lis()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Agente_Co> Agente = new ArrayList();
        
        for (Map registro : registros){
            Agente_Co agen = new Agente_Co((int)registro.get("IDAgente_co"),
                 (String) registro.get("Nombre"),
                 (String) registro.get("Telefono"));
         Agente.add(agen);
        }
        return Agente;
    }
    public int Insertar (Agente_Co agen) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL insertarAgente(?,?)}");
            st.setString(1, agen.getNombre());
            st.setString(2, agen.getTelefono());
            st.executeUpdate();
       
    }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
    }
        conectar.cerrarConexion();
        return 0;
}
    public int Actualizar(Agente_Co agen) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL Agente_actualizar(?,?,?)}");
            st.setInt(1, agen.getIDAgente_co());
            st.setString(2, agen.getNombre());
            st.setString(3, agen.getTelefono());
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
