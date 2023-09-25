package JavaMysql;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.*;
public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/java_perpustakaan";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public void startSql(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM tb_buku";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println("Id Buku" + rs.getInt("id_buku"));
                System.out.println("Judul Buku" + rs.getString("judul"));
                System.out.println("Pengarang Buku" + rs.getString("pengarang"));
            }
            stmt.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
