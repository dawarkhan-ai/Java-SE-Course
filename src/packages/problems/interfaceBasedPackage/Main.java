package packages.problems.interfaceBasedPackage;

import packages.problems.interfaceBasedPackage.plugin.Plugin;
import packages.problems.interfaceBasedPackage.plugin.PluginLoader;

public class Main {
    public static void main(String[] args) {
        String input = "sort";

        Plugin plugin = PluginLoader.getPlugin(input);
        plugin.execute();
    }
}
