package LargeImageStore;


import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class LargeImageStore {
    public static void LargeImage() {
        try {

            // Calling the connection
            Connection c = ConnectionProvider.getConnection();

            // giving the path where to insert images
            String q = "insert into images(pic) value (?)";

            // Using prepare Statement that
            PreparedStatement pstmt = c.prepareStatement(q);

            // It will provide us to choose the file from the system
            JFileChooser jfc = new JFileChooser();

            // This will help in opening the dialog box
            jfc.showOpenDialog(null);

            // Selected / chosen file will be store in the file variable
            File file = jfc.getSelectedFile();

            // It will read the file and store the data in fis variable
            FileInputStream fis = new FileInputStream(file);

            pstmt.setBinaryStream(1,fis,fis.available());

            // This will update the query
            pstmt.executeUpdate();

            // display mess in dialog box
            JOptionPane.showMessageDialog(null,"Success");

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}