/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaproject;

import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Erkhes
 */
public class Login {
    private void Login(String username, String password) throws SQLException{
        
        DatabaseConnection conn = new DatabaseConnection();
        if(conn.connect() != null){
        try{
            String query = "SELECT * FROM user_table where username = ? && userpass = ?";
            PreparedStatement st = conn.connect().prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet result = st.executeQuery();
        }
        catch (SQLException ex){
            System.Logger.getLogger(Login.class.getName()).log(System.Logger.Level.SEVERE, null, ex);
        }
        }
        else{
            System.out.println("Database connection unavailable");
        }
    }
}
