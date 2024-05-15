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
public class DAOBeneficiario {
    Conexion conectar=Conexion.getInstance();
    
    public List ObtenerDatos() throws SQLException{
        
        String proced ="sp_Beneficiario_listar()";
        List<Map> registros = new DateBase().Listar(proced);
        List<Beneficiario> Beneficiario = new ArrayList();
        
        for (Map registro : registros){
            Beneficiario ben = new Beneficiario((int) registro.get("IDBeneficiarios"),
                    (String) registro.get("Nombre"),
                    (String) registro.get("Apellido"),
                    (String) registro.get("Cedula"),
                    (String) registro.get("Telefono"),
                    (int) registro.get("IDContratos"));
         Beneficiario.add(ben);
        }
        return Beneficiario;
    }
     public int Insertar (Beneficiario ben) throws SQLException{
         try{ CallableStatement st=conectar.conectar().
                 prepareCall("{CALL insertarBeneciario(?,?,?,?,?)}");
             st.setString(1, ben.getNombre());
            st.setString(2, ben.getApellido());
            st.setString(3, ben.getCedula());
            st.setString(4, ben.getTelefono());
            st.setInt(5, ben.getIDContratos());
            st.executeUpdate();
       
         }catch(SQLException e){
        System.out.println(e+ " Error ");
        conectar.cerrarConexion();
        return -1;
     }
         conectar.cerrarConexion();
        return 0;
}
     public int Actualizar(Beneficiario ben) throws SQLException{
        try{
            CallableStatement st=conectar.conectar().
                    prepareCall("{CALL Beneficiario_actualizar(?,?,?,?,?,?)}");
            st.setInt(1, ben.getIDBeneficiarios());
            st.setString(2, ben.getNombre());
            st.setString(3, ben.getApellido());
            st.setString(4, ben.getCedula());
            st.setString(5, ben.getTelefono());
            st.setInt(6, ben.getIDContratos());
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
