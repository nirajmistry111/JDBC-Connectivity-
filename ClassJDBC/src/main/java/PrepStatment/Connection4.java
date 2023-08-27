package PrepStatment;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connection4 {
    private static Connection con;

    public static Connection getCon() {

        try{
            if(con == null){
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/nikdb";
                String username = "root";
                String password = "Rekha@9426";

                con = DriverManager.getConnection(url,username,password);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


        return con;
    }
}
