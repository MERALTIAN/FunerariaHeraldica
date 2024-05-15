/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Jeremy
 */
public class DateBase {
    Conexion conectar=Conexion.getInstance();
    
    public List Listar (String procedimiento) throws SQLException{
        ResultSet rs=null;
        //Arreglo de elementos en el que se almacenan los datos obtenidos de B
        List resultado=new ArrayList();
        try{

             CallableStatement st=conectar.conectar().
                     prepareCall("{CALL "+procedimiento+"}");

                    rs=st.executeQuery();
                    resultado=OrganizarDatos(rs);

        } catch (SQLException e) {
                 System.out.println("No se realizó la consulta: "+e.getMessage());
        }
        return resultado;
        }
    
               private List OrganizarDatos(ResultSet rs) {
                   List filas=new ArrayList();
                   try{
                       int numColumnas=rs.getMetaData().getColumnCount();
                       while(rs.next()){
                           Map<String, Object> renglon=new HashMap();
                           for(int i=1; i<=numColumnas; i++){
                               String nombreCampo=rs.getMetaData().getColumnName(i);
                               Object valor=rs.getObject(nombreCampo);
                               renglon.put(nombreCampo, valor);
                           }
                           filas.add(renglon);
                       }
                   }catch(SQLException e){
                       System.out.println(e+"Error");
                   }
                   return filas;
       }
    
}
