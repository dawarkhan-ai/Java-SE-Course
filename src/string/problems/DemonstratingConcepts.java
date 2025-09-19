package string.problems;

public class DemonstratingConcepts {
    public static void main(String[] args) {

        // demonstrate string constant pool and String immutability
        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = "Hello";

        System.out.println("s1 and s2 reffering to same object: " + (s1 == s2));
        System.out.println("s2 and s3 reffering to same object: " + (s2 == s3));
        s2 = s2 + "a";
        System.out.println("s2 and s3 reffering to same object after updatation: " + (s2 == s3));

        // demonstrate basic to advanced methods

            //count vowels, consonants, digits and special characters
            String input  = "Java@1234 is cool!";
            int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

            input = input.toLowerCase();

            for(char ch: input.toCharArray()) {
                if (Character.isLetter(ch)) {
                   if ("aeiou".indexOf(ch) != -1) {
                       vowels ++;
                   } else {
                       consonants ++;
                   }
                } else if (Character.isDigit(ch)) {
                    digits ++;
                } else if (ch != ' ') {
                    specialChars ++;
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Special Characters: " + specialChars);

            // Replacing spaces with hyphens and convert to uppercase
            String sSpaceReplace = "hello world how are you";
            System.out.println(sSpaceReplace);
            System.out.println("After modification: " + sSpaceReplace.replace(' ', '-').toUpperCase());

            // Extracting domain name
            String sDomainName = "example.user@gmail.com";
            System.out.println(sDomainName);
            System.out.println("After extracting domain name: " + sDomainName.substring(13, 22));

            // Find first and last occurrence of 'a' in a string
            String sOccur = "Dawar Khan";
            System.out.println(sOccur);
            System.out.println(sOccur.indexOf('a'));
            System.out.println(sOccur.lastIndexOf('a'));

            // Spliting String in to words and printing each word on a new line.
            String sSen = "Hello I am a CSE Student";

            String[] sWords = sSen.split(" ");

            for (String arr : sWords) {
                System.out.println(arr);
            }

        // Mutable Strings

            // Reversing a String using StringBuffer or StringBuilder
            String sImMuta = "Java";
            System.out.println("Given String: " + sImMuta);

            StringBuffer sBufMuta = new StringBuffer(sImMuta);
            sBufMuta.reverse();
            System.out.println("After reversing using StringBuffer: " + sBufMuta);

            StringBuilder sBuildMuta = new StringBuilder(sImMuta);
            sBuildMuta.reverse();
            System.out.println("After reversing using StringBuffer: " + sBuildMuta);

            // Perform some operations
            StringBuffer sBuffOp = new StringBuffer("Java");
            System.out.println("Appending: " + sBuffOp.append("Programming"));
            System.out.println("Inserting: " + sBuffOp.insert(4, "Language"));
            System.out.println("Deleting: " + sBuffOp.delete(4, 12));
            System.out.println("Replacing: " + sBuffOp.replace(0, 4, "CoreJava"));
            System.out.println("Reversing: " + sBuffOp.reverse());

            // Compare performance of String vs StringBuilder in appending 1000 numbers
            long start1 = System.currentTimeMillis();
            String s = "";

            for (int i = 0; i < 10000; i++) {
                s += i;
            }

            long end1 = System.currentTimeMillis();
            System.out.println("Time with String: " + (end1 - start1) + " ms");

            long start2 = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10000; i++) {
                 sb.append(i);
            }
            long end2 = System.currentTimeMillis();
            System.out.println("Time with StringBuilder: " + (end2 - start2) + " ms");

        // String Comparison

            //Take two Strings and check
            String sComp1 = new String("Hello");
            String sComp2 = new String("hello");

            System.out.println("Comparing reference of sComp1 and sComp2 creating using new keyword: " + (sComp1 == sComp2));
            System.out.println("Comparing content of both strings: " + sComp1.equals(sComp2));
            System.out.println("Comparing content with ignoring case: " + sComp1.equalsIgnoreCase(sComp2));
            System.out.println("Comparing contend lexicographic: " + sComp1.compareTo(sComp2));

            // sorting an array of strings alphabetically using compareTo()
            String[] arr = {"banana", "apple", "grape", "cherry", "mango"};

            for (int i = 0; i < arr.length - 1; i++) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j].compareTo(arr[j + 1]) > 0) {
                        // swap arr[j] and arr[j+1]
                        String temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }

            System.out.println("Sorted Strings: ");
            for (String sfr : arr) {
                System.out.println(sfr);
            }

        // String Formatting

            // Print a formatted bill
            String item1 = "Apple";
            int qty1 = 2;
            double price1 = 50.00;

            String item2 = "Banana";
            int qty2 = 5;
            double price2 = 10.00;

            double total = qty1 * price1 + qty2 * price2;

            System.out.println(String.format("%-10s %-10s %-10s", "Item", "Quantity", "Price" ));
            System.out.println(String.format("%-10s %-10d %-10.2f", item1, qty1, price1));
            System.out.println(String.format("%-10s %-10d %-10.2f", item2, qty2, price2));
            System.out.println(String.format("%-20s %-10.2f", "Total", total));

            // print multiplication table using /t
            int num = 5;

            System.out.println("Multiplication Table of " + num + ":");
            for (int i = 1; i <= 10; i++) {
                String line = String.format("%d\t*\t%d\t=\t%d", num, i, num * i);
                System.out.println(line);
            }

            // generating cosmetic shop bill
            String product1 = "Lux Sabun";
            int quantity1 = 12;
            double mrp1 = 30;

            String product2 = "Surf Excel";
            int quantity2 = 12;
            double mrp2 = 10;

            String product3 = "Dove Shampoo";
            int quantity3 = 12;
            double mrp3 = 2;

            double totalprice ;
            totalprice = quantity1 * mrp1 + quantity2 * mrp2 + quantity3 * mrp3;

            String fline1 = String.format("%-15s %-15s %-15s", "Product", "Quantity", "Price");
            String fline2 = String.format("%-15s %-15d %-15.2f", product1, quantity1, mrp1);
            String fline3 = String.format("%-15s %-15d %-15.2f", product2, quantity2, mrp2);
            String fline4 = String.format("%-15s %-15d %-15.2f", product3, quantity3, mrp3);
            String fline5 = String.format("%-30s %-15.2f", "Total", totalprice);

            System.out.println(fline1);
            System.out.println(fline2);
            System.out.println(fline3);
            System.out.println(fline4);
            System.out.println(fline5);

        // Wrapper Classes

            // convert "12345" to int and perform arithmetic operations
            String numString = "12345";
            System.out.println("Befor parsing: " + numString);
            int parsedNumString = Integer.parseInt(numString);
            System.out.println("After parsing: " + parsedNumString);
            System.out.println("Applying increment: " + (++parsedNumString));

    }
}
