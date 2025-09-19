package multiThreading.theoryImplementation.threadClass.commonConstructors;

public class DemonstratingEmptyThreadConstructor {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
          public void  run() {
             System.out.println("Creating Thread object and running to demonstrate default thread constructor.");
          }
        };

        t1.start();
    }
}
