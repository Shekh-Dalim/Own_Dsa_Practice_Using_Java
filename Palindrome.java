public class Palindrome {

    public static int isPalindrom(int n) {

        if (n < 0 || (n % 10 == 0 && n != 0)) {
            return 0;
        }
        int reverseNum = 0;

        while (n != 0) {
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n = n / 10;
        }
        return reverseNum;
    }

    public static void main(String args[]) {

        int n = 1210;
        int revNum = isPalindrom(n);

        if (n == revNum) {
            System.out.println("number is palindrom");
        } else {
            System.out.println("number is not a palindrom");
        }
    }

}
