package multiThreading.problems.intermediate;

class TrafficLight implements Runnable {

    @Override
    synchronized public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " light is GREEN");
            try {
                    Thread.sleep(3000); // Green for 3 sec
                    System.out.println(Thread.currentThread().getName() + " light is YELLOW");
                    Thread.sleep(1000); // Yellow for 1 sec
                    System.out.println(Thread.currentThread().getName() + " light is RED");
                    notifyAll(); // Notify next waiting thread
                    wait(); // Wait for next turn
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }
}

public class TrafficLightSimulation {
    public static void main(String[] args) {
        TrafficLight obj = new TrafficLight();
        Thread northSouth = new Thread(obj, "North-South");
        Thread eastWest = new Thread(obj, "East-West");
        Thread pedestrian = new Thread(obj, "Pedestrian");

        northSouth.start();
        eastWest.start();
        pedestrian.start();
    }
}
