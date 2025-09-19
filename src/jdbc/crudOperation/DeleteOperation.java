package jdbc.crudOperation;

import java.sql.*;

public class DeleteOperation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javaLearningII";
        String userName = "root";
        String pass = "sanukhan";

        try {
            Connection con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connected!");

            String query = "DELETE FROM students WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, 1);

            int rs = pstmt.executeUpdate();
            System.out.println("Successfully delete query executed! " + rs + " rows");

            con.close();
            System.out.println("Closed Connection!");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
