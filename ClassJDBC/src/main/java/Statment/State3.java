package Statment;

import Statment.Connection5;

import java.sql.Connection;
import java.sql.Statement;

public class State3 {
    public static void State3(){

        try{
            Connection con = Connection5.getCon();

            String q = //"UPDATE table1 SET tName = 'NiK', tCity = 'Toronto' WHERE tId = 2 ";
                    "UPDATE table1 SET tCity = 'Calgary' WHERE tId = 3";


            Statement stm = con.createStatement();
            stm.executeUpdate(q);
            System.out.println("Table Updated ...");

            con.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
