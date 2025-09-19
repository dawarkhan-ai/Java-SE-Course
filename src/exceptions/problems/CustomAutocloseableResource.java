package exceptions.problems;

class MyResource implements AutoCloseable {
    public MyResource() {
        System.out.println("MyResource: Resource acquired.");
    }

    public void useResource() {
        System.out.println("MyResource: Using the resource.");
    }

    @Override
    public void close() {
        System.out.println("MyResource: Resource released (close() called).");
    }
}

public class CustomAutocloseableResource {
    public static void main(String[] args) {
        try(MyResource resource = new MyResource()) {
            resource.useResource();
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        System.out.println("Program continues after try-with-resources.");
    }
}
