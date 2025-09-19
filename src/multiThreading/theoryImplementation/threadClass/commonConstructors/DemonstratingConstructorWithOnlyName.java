package multiThreading.theoryImplementation.threadClass.commonConstructors;


public class DemonstratingConstructorWithOnlyName {
    public static void main(String[] args) {
        Thread t = new Thread("Aayush") {
            public void run() {
                System.out.println(getName() + " is cleaning Dawar's house");
            }
        };

        t.start();
    }
}
