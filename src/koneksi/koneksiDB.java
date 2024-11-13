/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wiryamanto
 */
public class koneksiDB {
public static Connection c;

public static Connection getConnection(){
    if (c==null) {
        try {
            String url ="jdbc:mysql://localhost/Crud_App";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            c = (Connection) DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            Logger.getLogger(koneksiDB.class.getName()).log(Level.SEVERE,null, e);
        }
    }
    return c;
}


}
