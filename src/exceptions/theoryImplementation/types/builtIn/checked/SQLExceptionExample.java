/*package exceptions.theoryImplementation.types.builtIn.checked;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DrviverManager.getconnection("jdbc:mysql://localhost/db_name", "user","password");
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM non_existing_table");
        } catch (SQLException e) {
            System.out.println("SQLException occured: " + e.getMessage());
        }
    }
}

 */
