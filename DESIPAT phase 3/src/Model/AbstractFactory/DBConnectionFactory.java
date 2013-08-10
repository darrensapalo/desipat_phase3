/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.AbstractFactory;

import java.sql.Connection;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 *
 * @author Renz
 */
public abstract class DBConnectionFactory {
    
    private static String driverName = "";
    private static String url = "";
    private static String username = "";
    private static String password = "";
    
    public abstract Connection getConnection();

    public static DBConnectionFactory getInstance(){
        ResourceBundle rb = ResourceBundle.getBundle("database");
        Enumeration<String> settings = rb.getKeys();
        driverName = rb.getString("driverName");
        url=rb.getString("url");
        username=rb.getString("username");
        password=rb.getString("password");
        
        return new DBConnectionFactoryImpl();
    }   
    
    public static String getDriverName() {
        return driverName;
    }

    public static void setDriverName(String driverName) {
        DBConnectionFactory.driverName = driverName;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        DBConnectionFactory.url = url;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        DBConnectionFactory.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        DBConnectionFactory.password = password;
    }
    
}
