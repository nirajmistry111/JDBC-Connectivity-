package CallPrepState;



import java.sql.Connection;
import java.sql.CallableStatement;
import java.util.Scanner;


public class CallPrepState1 {
    public static void CallState1() {
        try{
            Connection con = Connection6.getCon();

            String q = "{call insertR(?, ?)}";

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



            System.out.println("Inserted ...");

            con.close();


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
