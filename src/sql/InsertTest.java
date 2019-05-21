package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertTest {
    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/sample";
            String user = "root";
            String pass = "mysql";

            Connection connection = DriverManager.getConnection(url, user, pass);

            String sql = "INSERT INTO `emp`(code,name,age,tel)VALUES(8,'konodo',29,'09-999-9999')";

            PreparedStatement pS = connection.prepareStatement(sql);
            int rows = pS.executeUpdate();

            System.out.println(rows + "is done");
            pS.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
