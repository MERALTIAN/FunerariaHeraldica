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
public class DAOClientes {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="sp_Cliente_listar()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Clientes> Cliente = new ArrayList();
        
        for (Map registro : registros){
            Clientes clie = new Clientes((int) registro.get("IDcliente"),
                 (String)  registro.get("Nombre"),
                 (String) registro.get("Apellido"),
                 (String) registro.get("Direccion"),
                 (String) registro.get("Cedula"),
                 (String)registro.get("Telefono"));
         Cliente.add(clie);
        }
        return Cliente;
    }
    public int Insertar (Clientes aut) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL insertarCliente(?,?,?,?,?)}");
            st.setString(1, aut.getNombre());
            st.setString(2, aut.getApellido());
            st.setString(3, aut.getDireccion());
            st.setString(4, aut.getCedula());
            st.setString(5, aut.getTelefono());
            st.executeUpdate();
       
    }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
    }
        conectar.cerrarConexion();
        return 0;
}
    public int Actualizar(Clientes aut) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL Cliente_actualizar(?,?,?,?,?,?)}");
            st.setInt(1, aut.getIDcliente());
            st.setString(2, aut.getNombre());
            st.setString(3, aut.getApellido());
            st.setString(4, aut.getDireccion());
            st.setString(5, aut.getCedula());
            st.setString(6, aut.getTelefono());
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
    
