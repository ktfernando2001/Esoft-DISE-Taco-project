package Taco; // This is you package or folder name

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyConnection {
 public static final String url="jdbc:mysql://localhost:3306/taco";
 public static final String user="root";
 public static final String password="123";
 static Connection con=null;

 public static Connection getDatabaseConnection(){
 try{
 Class.forName("com.mysql.jdbc.Driver");
 con = DriverManager.getConnection(url, user, password);
 }catch(ClassNotFoundException | SQLException ex){
 JOptionPane.showMessageDialog(null, "ERROR"+ex , "Error" , JOptionPane.ERROR_MESSAGE);
 System.exit(0);
 }
 return con;
 }

}