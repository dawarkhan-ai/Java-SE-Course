package jdbc.crudOperation;

import java.sql.*;

public class CreateOperation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javaLearningII";
        String userName = "root";
        String pass = "sanukhan";

        try {
            Connection con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connected!");

            String query = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1,1);
            pstmt.setString(2, "Rahul");
            pstmt.setString(3, "CS");

            int result = pstmt.executeUpdate();
            System.out.println("Successfully inserted!" + result);

            con.close();
            System.out.println("Closed Connection!");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
