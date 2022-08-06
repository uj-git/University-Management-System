package university.management.system;
import java.sql.*;

public class Conn {
    
    //Interface from sql package to establish the connection
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "mysqlUJ123");
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        
    }
    
}
