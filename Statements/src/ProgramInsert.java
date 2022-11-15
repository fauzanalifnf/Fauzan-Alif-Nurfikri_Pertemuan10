import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ProgramInsert {

   
    public static void main(String[] args) {
       Connection koneksi = KoneksiDatabase.getkoneksi();
       Statement statement = null;
       try {
           statement =koneksi.createStatement();
           System.out.println("Statement berhasil dibuat");
           String url= "INSERT INTO barang (kode_barang,nama_barang,jumlah,harga)Values('B006','Buku',50,3000)";
           statement.executeUpdate(url);
       } catch (SQLException ex) {
           System.out.println("Statement gagal dibuat");
           System.out.println("Pesan : "+ex.getMessage());
        } finally{
           if (statement != null) {
               try {
                   statement.close();
                   System.out.println("Statement berhasil ditutup");
               } catch (SQLException ex) {
                   System.out.println("Statement gagal ditutup");
                   System.out.println("Pesan : "+ex.getMessage());
               }
           }
       }
    }
    
}
