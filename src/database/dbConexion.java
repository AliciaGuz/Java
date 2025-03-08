/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class dbConexion {
    private final String URL = "jdbc : mysql: //localhost:3306/";
    private final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB = "puntoVenta";
    private final String USER = "root";
    private final String PASSWORD = "3stefany";
    
    public Connection conectar()
    {
        try
        {
            Class .forName(DB_DRIVER);
            this.connection=DriverManager.getConnection(
                    URL+DB,USER,PASSWORD);
        }catch( ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.connection;
       
    }
    
    public void desconnectar(){
        try{
            this.conecction.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}




    
    
    



