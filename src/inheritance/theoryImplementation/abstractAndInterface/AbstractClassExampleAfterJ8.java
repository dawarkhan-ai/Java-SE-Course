package inheritance.theoryImplementation.abstractAndInterface;

interface Camera {
    void click();

    default void openGallery() {
        System.out.println("Opening gallery...");
    }

    static void showInfo() {
        System.out.println("Camera Interface - Java 8 feature");
    }
}

class PhoneCamera implements Camera {
    public void click() {
        System.out.println("Photo clicked!");
    }
}

public class AbstractClassExampleAfterJ8 {
    public static void main(String[] args) {
        PhoneCamera pc = new PhoneCamera();
        pc.click();           // Output: Photo clicked!
        pc.openGallery();     // Output: Opening gallery...
        Camera.showInfo();    // Output: Camera Interface - Java 8 feature
    }
}
