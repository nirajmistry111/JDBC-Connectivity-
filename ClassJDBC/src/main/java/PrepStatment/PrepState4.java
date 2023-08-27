package PrepStatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PrepState4 {
    public static void PrepState4() {
        try {
            Connection con = Connection4.getCon();
            String q = " SELECT * FROM table1 ";

            PreparedStatement pstm = con.prepareStatement(q);
            pstm.execute();

            ResultSet rs = pstm.getResultSet();

            while(rs.next()){
                int Id =  rs.getInt("tID");
                String name = rs.getString("tName");
                String City = rs.getString("tCity");

                System.out.println("ID: " + Id + "     Name : "  + name + "        City : " + City);
            }

            System.out.println("Done..");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
