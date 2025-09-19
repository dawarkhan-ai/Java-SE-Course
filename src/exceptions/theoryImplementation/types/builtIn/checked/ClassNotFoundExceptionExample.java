package exceptions.theoryImplementation.types.builtIn.checked;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Driver class must be in classpath
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}

