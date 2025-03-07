/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class dbConexion {
    private final String url = "jdbc : mysql: //localhost:3306/";
    private final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB = "puntoVenta";
    private final String USER = "root";
    private final String PASSWORD = "3stefany";
}

public Connection conectar(){
    try{
        Class.forName(DB_Driver);
        this.connnection = DriverManager.getConnection(
                URL + DB,USER, PASSWORD);
    } catch (ClassNotFoundException | SQLException e){
      
    }
    
    
    
}


