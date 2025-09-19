package jdbc.crudOperation;

import java.sql.*;

public class UpdateOperation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javaLearningII";
        String userName = "root";
        String pass = "sanukhan";

        try {
            Connection con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connected!");

            String query = "UPDATE students SET name = ? WHERE id = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "Dawar");
            pstmt.setInt(2, 1);

            int rs = pstmt.executeUpdate();
            System.out.println("Succfully update query executed! " + rs);

            con.close();
            System.out.println("Closed Connection!");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
