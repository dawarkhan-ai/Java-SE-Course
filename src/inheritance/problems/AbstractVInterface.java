package inheritance.problems;

abstract class Device {
    String deviceName;

    abstract void powerSavingMode();

    void identifyDevice() {
        System.out.println("This is the Device named-" + deviceName);
    }

    Device(String deviceName) {
        this.deviceName = deviceName;
    }
}

interface Connectable {
    void connect();
}

class Printer extends Device implements Connectable {
    public void connect() {
        System.out.println("Printer is Connect succussfully...");
    }

    void powerSavingMode() {
        System.out.println("The power saving mode of Printer is turning on....");
    }

    Printer(String deviceName) {
        super(deviceName);
    }
}

class Scanner extends Device implements Connectable {
    public void connect() {
        System.out.println("Scanner is Connect succussfully...");
    }

    void powerSavingMode() {
        System.out.println("The power Saving mode of Scanner is turning on...");
    }

    Scanner(String deviceName) {
        super(deviceName);
    }
}

public class AbstractVInterface {
    public static void main(String[] args) {
        Device deviceObj = new Printer("Printer");
        deviceObj.identifyDevice();
        deviceObj.powerSavingMode();

        Connectable c =  (Connectable)deviceObj;
        c.connect();

        deviceObj = new Scanner("Scanner");
        deviceObj.identifyDevice();
        deviceObj.powerSavingMode();

        c =  (Connectable)deviceObj;
        c.connect();
    }
}
