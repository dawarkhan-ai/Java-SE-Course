package packages.theoryImplementation.accessSpecifierActions;

import packages.theoryImplementation.accessSpecifierActions.pack1.*;
import packages.theoryImplementation.accessSpecifierActions.pack2.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        new ClassAccessDemo().checkAccess();

        System.out.println("\n");
        new SamePackageAccessDemo().checkAccess();

        System.out.println("\n");
        new SubClassAccessDemo().checkAccess();

        System.out.println("\n");
        new NonSubClassAccessDemo().checkAccess();
    }
}
