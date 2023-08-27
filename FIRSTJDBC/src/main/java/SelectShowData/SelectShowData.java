package SelectShowData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectShowData {
    public static void ShowData(){
        try {
            Connection con = ConnectionProvider1.getConnection();
            String query = " Select * from table1";

            Statement stm = con.createStatement();

            ResultSet s = stm.executeQuery(query);

            while(s.next()){
                int id= s.getInt(1);
                String name = s.getString(2);
                String city = s.getString(3);
                System.out.println(id + " -- " + name + " -- " + city);
            }


        }catch (Exception e){

e.printStackTrace();


        }
    }
}
