package PrepStatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepState3 {
    public static void PrepState3() {
        try {
            Connection con = Connection4.getCon();
            String q = " DELETE FROM table1 WHERE tId = ? ";

            PreparedStatement pstm = con.prepareStatement(q);

            Scanner sc = new Scanner(System.in);


            System.out.println("Enter the id:");
            int i = sc.nextInt();


            pstm.setInt(1, i);

            pstm.executeUpdate();

            System.out.println("Done..");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
