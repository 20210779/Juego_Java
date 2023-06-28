/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
import java.sql.*;

/**
 *
 * @author Javier
 */
public class conexion {
    
      public static Connection getConexion(){
        
         //Cadena de conexión
        String conexionUrl  = "jdbc:sqlserver://localhost:50021;" // <- Editar por su puerto de SQL
                            + "databaseName=OctopusRuns;" // <- Editar por su base de datos
                            + "user=Rical;"
                            + "password=itr2023;" 
                            + "encrypt=true;trustServerCertificate=true";
        
        //Retornamos la conexion
        try{
            //Creamos una variable de tipo Connection, al que le pasamos nuestra cadena de conexion
            Connection conn = DriverManager.getConnection(conexionUrl) ;
            //SI funciona, retornamos la conexion
            return conn;
        }catch(SQLException ex){
            //Si no funciona, imprimimos en consola el error y retornamos un valor nulo
            System.out.println(ex.toString());
            return null;
        }
    } 

    static PreparedStatement prepareStatement(String consulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
