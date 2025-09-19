package string.problems;

public class CSVParser {
    public static void main(String[] args) {
        String input = "John,22,Male;Alice,20,Female;Bob,25,Male";

        String[] records = input.split(";");

        System.out.printf("%-8s %-8s %-8s %n", "Name", "Age", "Gender");

        for (String record : records) {
            String[] fields = record.split(",");
            System.out.printf("%-8s %-8s %-8s %n", fields[0], fields[1], fields[2]);
        }
    }
}
