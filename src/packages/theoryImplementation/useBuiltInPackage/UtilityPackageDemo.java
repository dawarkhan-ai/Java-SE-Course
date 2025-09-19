package packages.theoryImplementation.useBuiltInPackage;

import java.util.ArrayList;

public class UtilityPackageDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Programming Languagess: ");
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
