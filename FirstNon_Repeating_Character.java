import java.util.HashMap;

class FirstNonRepeating {

    public static char firstNonRepeating(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0'; // No non-repeating character
    }

    public static void main(String[] args) {

        String str = "aabbcde";

        System.out.println(firstNonRepeating(str));
    }
}