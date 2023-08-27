package Statment;

import Statment.Connection5;

import java.sql.Connection;
import java.sql.Statement;

public class State4 {
    public static void State4(){
        try{
            Connection con = Connection5.getCon();

            String q = "DELETE FROM Table1 WHERE tID = 4";

            Statement stm = con.createStatement();

            stm.executeUpdate(q);
            System.out.println("Row Deleted ...");

            con.close();


        }catch (Exception e){

        }
    }
}
