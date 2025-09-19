package packages.theoryImplementation.accessSpecifierActions.pack2;

import packages.theoryImplementation.accessSpecifierActions.pack1.ClassAccessDemo;

public class NonSubClassAccessDemo {
    public void checkAccess() {
        ClassAccessDemo ad = new ClassAccessDemo();
        System.out.println("NonSubClass (Different Package, Non-subclass): ");
        System.out.println("public: " + ad.pub);
        // System.out.println("protected: " + ad.prot); // ❌ Not accessible
        // System.out.println("default: " + ad.def);   // ❌ Not accessible
        // System.out.println("private: " + ad.priv);  // ❌ Not accessible
    }
}
