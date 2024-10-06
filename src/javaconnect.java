/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */

import java.sql.*;
import javax.swing.*;
public class javaconnect {
    
    
    public static void connecrdb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bank/details","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
