import java.util.HashMap;

class RemoveDuplicates {

    public static void removeDuplicates(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Print only characters that appear once
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {

        String str = "dadalm";

        removeDuplicates(str);
    }
}