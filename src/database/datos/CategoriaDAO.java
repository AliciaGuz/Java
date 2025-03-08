/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.datos;

import datos.interfaces.CRUDGeneralInterface;
import entidades.Categoria;
import java.util.List;
import database.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CategoriaDAO implements CRUDGeneralInterface<Categoria>{

    public final Conexion conectar;
    public PreparedStatement ps;
    private ResultSet rs;
    
    
    public CategoriaDAO(){
        conectar=Conexion.getInstance();
    }
    
    @Override
    public List<Categoria> getAll(String list) {
        List<Categeoria> registros = new ArrayList();
        try {
            ps = conectar.conectar().PrepareStatement
        ("SELECT * From categoria WHERE nombre like ?");
        ps.setString(1,"%" + list + "%");
        rs = ps.executeQuery();
        while(rs.next()){
            registros.add(new Categoria
            (rs.getInt(1), rs.getString(2),rs.getString(3), rs.getBoolean(4)));
            }
        ps.close();
        rs.close();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            ps = null;
            rs = null;
            conectar.desconnectar();
        }
    }

    @Override
    public boolean insert(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Categoria object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean onVariable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean offVariable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int exist(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int total() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
