package lab_17_03_2021;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gauri
 */
public class dbConnection {
   public static Connection getConnection(){ 
       Connection con=null;
       try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("loaded");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info","root","root");
           System.out.println("connect");
       }
      catch (ClassNotFoundException ex) {
             Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
         }
     
      return con; 
    }  
}

