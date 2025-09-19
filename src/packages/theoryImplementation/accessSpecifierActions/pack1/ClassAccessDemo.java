package packages.theoryImplementation.accessSpecifierActions.pack1;

public class ClassAccessDemo {
    public int pub = 1;
    protected int prot = 2;
    int def = 3;
    private int priv = 4;

    public void checkAccess() {
        System.out.println("AccessDemo: ");
        System.out.println("public: " + pub);
        System.out.println("protected: " + prot);
        System.out.println("default: " + def);
        System.out.println("private: " + priv);
    }
}
