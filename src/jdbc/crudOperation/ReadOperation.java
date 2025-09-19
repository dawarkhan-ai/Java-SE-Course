package jdbc.crudOperation;

import java.sql.*;

public class ReadOperation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/javaLearningII";
        String userName = "root";
        String pass = "sanukhan";

        try {
            Connection con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connected!");

            String query = "SELECT * FROM students WHERE dept = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "CS");
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Succfully query executed!");

            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }


            con.close();
            System.out.println("Closed Connection!");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
