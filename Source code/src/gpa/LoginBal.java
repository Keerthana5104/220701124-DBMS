/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gpa;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Keerthana .S
 */
public class LoginBal {
    
    
    /*public void insertdata(LoginBean lb){
        
        Connection con;
        
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfo","root","Rec124.edu.in");
                 System.out.println(con);
                 
                String query="insert into signup values(?,?)";
                PreparedStatement ps;
                ps=con.prepareStatement(query);
                ps.setString(1, lb.getEmail());
                ps.setString(2,lb.getPassword());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"You have signup successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Gpa.class.getName()).log(Level.SEVERE, null, ex);
            } 
       
    }
    
    public boolean checkLogin(String Username,String Password){
        boolean b=false;
        try{
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfo","root","Rec124.edu.in");
            String query="select Username,Password from signup where Username='"+Username+"' AND Password='"+Password+"' ";            
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                b=true;
            }else{
                JOptionPane.showMessageDialog(null, "Invalid email or password try again");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return b;
    
    
    }*/
    
    
}
