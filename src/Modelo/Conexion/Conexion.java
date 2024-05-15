/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Jeremy
 */
public class Conexion {
    private static final String URL="jdbc:sqlserver://localhost:1433;"+ 
           "databaseName=Funeraria;"+"integratedSecurity=true;"+ 
           "encrypt=true;trustServerCertificate=true";
    
private static Conexion instancia=null;
private static Connection conex=null;

private Conexion(){}

public Connection conectar(){
    try{
        conex=DriverManager.getConnection(URL);
        System.out.println("Conexion establecida");
        return conex;  
        
    }catch(SQLException e ){
        System.out.println("Error de conexión");
    }
    return conex;
}
public void cerrarConexion() throws SQLException{
try{
    conex.close();
        System.out.print("Conexión cerrada");
}catch(SQLException e) {
        System.out.println("Error al cerrar conexión" + e);
conex.close();
}finally{
    conex.close();
}
}
public static Conexion getInstance(){
    if(instancia==null){
        instancia=new Conexion();
    }
    return instancia;
}
    
}
