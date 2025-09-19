package packages.theoryImplementation.accessSpecifierActions.pack1;

public class SamePackageAccessDemo {
    public void checkAccess() {
        ClassAccessDemo ad = new ClassAccessDemo();
        System.out.println("SamePackage: ");
        System.out.println("public: " + ad.pub);
        System.out.println("protected: " + ad.prot);
        System.out.println("default: " + ad.def);

        // causes compile-time eroor
        // System.out.println("private: " + ad.priv);
    }
}
