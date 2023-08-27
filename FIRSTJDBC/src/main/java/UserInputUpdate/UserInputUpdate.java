package UserInputUpdate;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UserInputUpdate {
    public static void UserInput(){

        try {

            // Calling the connection
            Connection con = ProvideConnection.UpdateInput();

            // giving the path where to insert images
            String q = "update table1 set  tName = ? ,  tCity = ? where tID = ?";


            //UserInput

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Name : ");
            String na = sc.next().trim();

            System.out.println("Enter the City : ");
            String ci = sc.next().trim();

            System.out.println("Enter the id : ");
            int i = Integer.parseInt(sc.next());


            PreparedStatement pst = con.prepareStatement(q);

        // QUERY AND SET SEQUENCE HAS TO BE SAME ---ALERT

            pst.setString(1 , na);
            pst.setString(2 , ci);
            pst.setInt(3 , i);


            pst.executeUpdate();
            System.out.println("done.............");
            System.out.println(na + " --- " + ci + " --- " + i);
            con.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}