package packages.problems.interfaceBasedPackage.plugin.sort;

import packages.problems.interfaceBasedPackage.plugin.Plugin;
import java.util.Arrays;

public class SortPlugin implements Plugin {
    public void execute() {
        int[] data = {5, 3, 8, 1, 2 };
        Arrays.sort(data);
        System.out.print("SortPlugin: Sorted data = ");
        for (int i : data ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
