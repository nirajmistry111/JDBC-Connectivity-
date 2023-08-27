package PrepStatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepState2 {

    public static void PrepState2() {
        try {
            Connection con = Connection4.getCon();
            String q = "UPDATE table1 SET tName = ?, tCity = ? WHERE tID = ?";

            PreparedStatement pstm = con.prepareStatement(q);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name:");
            String n = sc.next();

            System.out.println("Enter the City:");
            String c = sc.next();

            System.out.println("Enter the id:");
            int i = sc.nextInt();

            pstm.setString(1, n);
            pstm.setString(2, c);
            pstm.setInt(3, i);

            pstm.executeUpdate();

            System.out.println("Done..");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
