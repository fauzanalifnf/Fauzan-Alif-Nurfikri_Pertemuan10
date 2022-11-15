import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class program {

   
    public static void main(String[] args) {
       try {
           Driver driver = new Driver();
           DriverManager.registerDriver(driver);
           System.out.println("Berhasil meregristrasi driver");
       }
       catch(SQLException ex) {
           System.out.println("Gagal meregristrasi driver");
           System.out.println("Pesan : "+ex.getMessage());
       }
       try {
           String url="jdbc:mysql://localhost:3306/db_warung";
           String user="root";
           String pass="";
           Connection koneksi = DriverManager.getConnection(url, user, pass);
           System.out.println("Koneksi ke database berhasil");
       }
       catch (SQLException ex){
           System.out.println("koneksi ke database gagal");
           System.out.println("Pesan : "+ex.getMessage());
       }
    }
}
