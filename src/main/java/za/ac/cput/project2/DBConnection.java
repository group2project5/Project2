package za.ac.cput.project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 220126283
 */
public class DBConnection 
{
    
    public static Connection derbyConnection() throws SQLException 
        {
            String url = "jdbc:derby://localhost:1527/SpringFieldDB";
            String user = "administrator";
            String password = "password";           
            return DriverManager.getConnection(url, user, password);
        }
    
}