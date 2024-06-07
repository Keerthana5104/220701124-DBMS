/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Keerthana .S
 */
public class Gpa {
    
    Connection con;
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfo","root","Rec124.edu.in");
                 System.out.println(con);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Gpa.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        gframe gf=new gframe();
        gf.show();
        
        // TODO code application logic here
    }
    
}
