package CallPrepState;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class CallPrepState4 {
    public static void CallState4() {
        try {
            Connection con = Connection6.getCon();

            // Call Procedure

            String q = "{call `Update`(? , ?)}"; // Use backticks around the stored procedure name

            CallableStatement stmt = con.prepareCall(q);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the id:");
            int i = sc.nextInt();

            System.out.println("Enter the Name:");
            String n = sc.next();

            stmt.setInt(1, i);
            stmt.setString(2, n);
            stmt.execute();

            System.out.println("Success");

            System.out.println("Updated ...");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
