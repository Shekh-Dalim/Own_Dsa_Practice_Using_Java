
import java.util.HashMap;

class Find_The_Repeating_Element {

    public static void repeatingEle(String str) {

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

        // Find the first repeating character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println("First repeating element: " + ch);
                break;
            }
        }
    }

    public static void main(String[] args) {

        String str = "dadalm";

        repeatingEle(str);
    }
}