package packages.problems.interfaceBasedPackage.plugin.print;

import packages.problems.interfaceBasedPackage.plugin.Plugin;

public class PrintPlugin implements Plugin {
    public void execute() {
        System.out.println("PrintPlugin: Printing data...");
    }
}
