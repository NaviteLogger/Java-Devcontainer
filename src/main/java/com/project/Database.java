import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public void processData() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/dev", "user", "pass");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM reports");

        while (rs.next()) {
            System.out.println(rs.getString("data"));
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public void findUser(String username) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://db:5432/app", "user", "pass");
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM users WHERE username = '" + username + "'";
        ResultSet rs = stmt.executeQuery(sql);
    }
}