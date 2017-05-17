/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.*;

/**
 *
 * @author Jesus
 */
public class Conexion {
    private Connection conecxion = null;
    public Connection obtenerConexion() throws ClassNotFoundException, SQLException{
        if(conecxion==null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conecxion = DriverManager.getConnection("jdbc:mysql://localhost/unica", "root", "123456");
                System.out.println("conecxio"+conecxion);
                
            }catch(SQLException ex){
                throw new SQLException (ex);              
            }catch(ClassNotFoundException ex){
               throw new  ClassNotFoundException(ex.getMessage());
            }
        }
        return conecxion;
    }
            
            
             
}
