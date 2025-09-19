package string.problems;

public class FrequencyCounter {
    public static void main(String[] args) {
        String input = "apple";
        int[] freq = new int[26];

        for (char ch : input.toCharArray()) {
            if(ch >= 'a' && ch <='z') {
                freq[ch -'a']++;
            }
        }

        for(int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            }
        }
    }
}
