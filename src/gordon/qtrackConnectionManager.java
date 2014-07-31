/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gordon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author bradlye
 */
public class qtrackConnectionManager {
    
    //This is the connection, keep it private to protect it
    private Connection qtrackConnection;
    
    public void initQConnection(){
        //Initialize the Connection by setting it to null
        qtrackConnection = null;
    }
       
    public boolean connectToQ(String qURL, String qUser, String qPass){
        try
        {
            //First, load the JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //Get the Connection!
            qtrackConnection = DriverManager.getConnection(qURL, qUser, qPass);
            
            //Let the user know it worked!
            JOptionPane.showMessageDialog(null, "Connection Success!");
            
            //return True for backend useage
            return true;
        }
        catch(Exception e)
        {
           //Let the user know it failed
            JOptionPane.showMessageDialog(null, "Something went wrong while connecting to the database, check the log file!", "Oh no!", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, e, "Exception Occurred", JOptionPane.ERROR_MESSAGE);
            
            //return false for backend purposes
            return false;
        }
    }
    
    public Connection getQ(){
        return qtrackConnection;
    }
    
    public void closeQ(){
        qtrackConnection = null;
    }
}
