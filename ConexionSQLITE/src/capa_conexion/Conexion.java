/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package capa_conexion;
//importamos los paquetes necesarios
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Guzman
 */
public class Conexion {
//creamos la variable coneccion
    static Connection cn = null;
//creamos la clase conexion
    public static Connection Enlace(Connection cn)throws SQLException{
    //ruta de la base de datos la cual crearemos
        String ruta = "C:\\BDproducto.db";
        try{
        Class.forName("org.sqlite.JDBC");
        cn = DriverManager.getConnection("jdbc:sqlite:"+ruta);        
        }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null, e);
        }
        return cn;
    }
}
