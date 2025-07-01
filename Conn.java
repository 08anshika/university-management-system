package university.management.system;
//SQL PACKAGE K andr connection ata h
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //make connection string means ap jis database se connect krne vale hote ho uske info mention krne padte h
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "anshika@0803");
            //statements ki help se ap apne mysql queries ko run kr skte h
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
