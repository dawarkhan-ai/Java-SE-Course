package packages.problems.interfaceBasedPackage.plugin;

import  packages.problems.interfaceBasedPackage.plugin.print.PrintPlugin;
import  packages.problems.interfaceBasedPackage.plugin.sort.SortPlugin;

public class PluginLoader {
    public static Plugin getPlugin (String type) {
        switch(type.toLowerCase()) {
            case "print":
                return new PrintPlugin();
            case "sort":
                return new SortPlugin();
            default:
                throw new IllegalArgumentException("Unknown plugin type: " + type);
        }
    }
}
