/*
 * javaconnect.java V 1 - This is the file that manages the connection to the
 * BagAware database in MySQL
 */
package bagawareapp;

import java.sql.Connection;

/**
 * @author Team2FYS - IS106
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {

    Connection conn = null;
    public Connection connection;
    public static Connection ConnecrDb() {
        try {
            Driver myDriver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver( myDriver );
            String URL = "jdbc:mysql://localhost:3306/bagawaredb";
            String USER = "root";
            String PASS = "";
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            
            return conn ;
            }catch (Exception e){
                            JOptionPane.showMessageDialog(null, e);
                            return null;
                            
                            }

        }
    }
