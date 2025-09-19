package jdbc;

import java.sql.*;

public class EstablishingDatabaseConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/javaLearningII";
        String userName = "root";
        String pass = "sanukhan";

        Connection con = null;
        try {
             con = DriverManager.getConnection(url, userName, pass);
            System.out.println("Connected Successfully!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(con != null) {
                    con.close();
                    System.out.println("Closed successfully!");
                }
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
