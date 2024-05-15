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

/**
 *
 * @author Jeremy
 */
public class DAOModelo {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="sp_Modelo_listar()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Modelos> Modelo = new ArrayList();
        
        for (Map registro : registros){
            Modelos mod = new Modelos((int)registro.get("IDModelo"),
                 (String) registro.get("Nombre"),
                 (String) registro.get("Modelo"),
                 (String) registro.get("Medida"),
                 (String) registro.get("Color"));
         Modelo.add(mod);
        }
        return Modelo;
    }
    public int Insertar (Modelos mod) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL insertarModelo(?,?,?,?)}");
            st.setString(1, mod.getNombre());
            st.setString(2, mod.getModelo());
            st.setString(3, mod.getMedida());
            st.setString(4, mod.getColor());
            st.executeUpdate();
       
    }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
    }
        conectar.cerrarConexion();
        return 0;
}
    public int Actualizar(Modelos mod) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL sp_Modelo_actualizar(?,?,?,?,?)}");
            st.setInt(1, mod.getIDModelo());
            st.setString(2, mod.getNombre());
            st.setString(3, mod.getModelo());
            st.setString(4, mod.getMedida());
            st.setString(5, mod.getColor());
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
