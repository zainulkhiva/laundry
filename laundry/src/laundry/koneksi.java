package laundry;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class koneksi {
    private String url = "jdbc:mysql://localhost:3306/db_laundry";
    private String username ="root"; 
    private String password =""; 
    private Connection con;
public void connect () {
    try {
        con = DriverManager.getConnection( url,username,password);
        System.out.println("Koneksi Berhasil");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error Koneksi ke Database:\n" + e);
    }
} 

   public Connection getCon() {
       return con;
   }
}
