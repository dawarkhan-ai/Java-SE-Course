package packages.theoryImplementation.createAndUseUserDefinedPackage;

import packages.theoryImplementation.createAndUseUserDefinedPackage.mypack.Hello;

public class Main {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.sayHi();
    }
}
