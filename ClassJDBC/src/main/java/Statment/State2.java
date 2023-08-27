package Statment;

import Statment.Connection5;

import java.sql.Connection;
import java.sql.Statement;

public class State2 {


    public static void State2(){


        try{

            Connection con = Connection5.getCon();

            String q = "INSERT INTO table1(tID, tName, tCity)\n" +
                    "VALUES (4, 'Dhruv', 'Ahmedabad')";



            Statement st = con.createStatement();


            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);

            System.out.println("Data Inserted  ...");

            con.close();


        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
