package PrepStatment;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class PrepState1 {
    public static void PrepState1() {
        try{
            Connection con = Connection4.getCon();

            String q = "INSERT INTO Table1(tName, tCity) VALUES (?, ?)";

            PreparedStatement pstm = con.prepareStatement(q);
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter the Name:");
            String n = sc.next();

            System.out.println("Enter the City:");
            String c = sc.next();


            pstm.setString(1, n);
            pstm.setString(2, c);

            pstm.executeUpdate();



            System.out.println("Inserted ...");

            con.close();


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
