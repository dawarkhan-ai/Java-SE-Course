package packages.theoryImplementation.accessSpecifierActions.pack2;

import packages.theoryImplementation.accessSpecifierActions.pack1.ClassAccessDemo;

public class SubClassAccessDemo extends ClassAccessDemo {
    public void checkAccess() {
        System.out.println("SubClass (Different Package, Subclass): ");
        System.out.println("public: " + pub);
        System.out.println("protected (via inheritance): " + prot);
        // System.out.println("default: " + def); // ❌ Not accessible
        // System.out.println("private: " + priv); // ❌ Not accessible
    }
}
