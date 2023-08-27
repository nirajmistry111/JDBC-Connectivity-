package Statment;

import Statment.Connection5;

import java.sql.Connection;
import java.sql.Statement;

public class State1 {
public static void State1(){


    try{

        Connection con = Connection5.getCon();

        String q = "create table classjdbc(ID int(30) primary key auto_increment , Name varchar (200) not null , City varchar(400))";

        Statement st = con.createStatement();


        Statement stmt = con.createStatement();
        stmt.executeUpdate(q);

        System.out.println("Table created ...");

        con.close();


    }catch(Exception e){
        e.printStackTrace();
    }
}

}
