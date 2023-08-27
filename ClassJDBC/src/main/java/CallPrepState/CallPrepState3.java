package CallPrepState;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class CallPrepState3 {

    public static void CallState3() {
        try {
            Connection con = Connection6.getCon();

            // Call Procedure and no parenthesis if no argument
            String q = "{call `Select`}";

            CallableStatement stmt = con.prepareCall(q);

            stmt.execute();

            ResultSet rs = stmt.getResultSet(); // Get the result set from the stored procedure



            while (rs.next()) { // Use lowercase "while" and "rs" for ResultSet
                int id = rs.getInt("id"); // Use lowercase "id" for variable name
                String name = rs.getString("name");
                System.out.println("ID: " + id + "  Name : "  + name); // Print the retrieved value
            }

            System.out.println("Success");

            System.out.println("Displayed ...");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
