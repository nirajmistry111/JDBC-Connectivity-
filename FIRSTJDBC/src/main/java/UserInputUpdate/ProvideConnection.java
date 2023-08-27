package UserInputUpdate;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProvideConnection {
    private static Connection con;
    public static Connection UpdateInput(){

        try{

            if(con == null){
                //Class.forName("com.mysql.cj.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                // url = "jdbc:mysql://localhost:3306/nikdb"
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nikdb" , "root" , "Rekha@9426");

            }


        }catch (Exception e){
             e.printStackTrace();
        }
        return con;
    }
}
