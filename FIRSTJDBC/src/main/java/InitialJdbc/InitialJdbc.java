package InitialJdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InitialJdbc {
    private static Connection con;
    public static void InitJdbc(){
        try{

            // Load class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create ConnectionProvider
            String url = "jdbc:mysql://localhost:3306/nikdb";
            String username = "root";
            String password = "Rekha@9426";

            Connection con = DriverManager.getConnection(url,username,password);
/*
//          Create Query
            String q = "create table table1(tID int(20) primary  key auto_increment , tName varchar(200) not null , tCity varchar(400))";


//          Create Statement object
            Statement stmt = con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("Table created ...");

            con.close();
*/

/*
// Insert------------------------------------

//          Insert Query
            String q = "insert into Table1(tName , tCity) values (?, ?)";


//          Create PreparedStatement object
             PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1,"Nik Mistry");
            pstmt.setString(2,"Ahmedabad");

            pstmt.executeUpdate();



            System.out.println("Inserted ...");

            con.close();
*/


// Image insertion ------------------------------------

            String q = "insert into images(pic) values (?)";


//          Create PreparedStatement object
            PreparedStatement pstmt = con.prepareStatement(q);
//          To read file
            FileInputStream fis = new FileInputStream("C:\\Users\\mistr\\IdeaProjects\\FIRSTJDBC\\src\\main\\resources\\img-min.jpg");

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();

            System.out.println("done ...");

            con.close();



        }catch(Exception e){
            System.out.println(e);
        }
    }
}


/*
Class.forName("com.mysql.jdbc.Driver");


        // step 2-- Get the Connection
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
        "sql@1234");





        String abc = "SELECT * FROM emp";

        // Step -3     Create the Statment
        Statement st = cn.createStatement();

        // Step -4
        ResultSet rs = st.executeQuery(abc);
        while (rs.next()) {
        int id = rs.getInt("Emp_Id");
        String name = rs.getString("Emp_name");



        // print the results
        //System.out.format("%s, %s, \n", id, name);
        System.out.println("Id :- " + id +" Name  : -  "+ name);
        }
        // Step -5 Close the Connection
        st.close();


        } catch (Exception e) {
        System.out.println(e);
        }

        }
        */