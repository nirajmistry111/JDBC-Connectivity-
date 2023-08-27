package CallPrepState;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class CallPrepState2 {
    public static void CallState2() {
        try{
            Connection con = Connection6.getCon();

            // Call Function

            String q = "{call deleteRecord(?)}";

            CallableStatement stmt = con.prepareCall(q);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the id:");
            int i = sc.nextInt();

            stmt.setInt(1, i);

            stmt.execute();

            System.out.println("Success");



            System.out.println("Deleted ...");

            con.close();


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
