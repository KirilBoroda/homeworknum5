public class Palindrom {
    private static boolean isPalindrome(String s) {
        if (s.length() <= 1)
            return true;

        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
    }

    public static void main(String[] args) {
        String s = "KAYAK";
        System.out.println(isPalindrome(s) ? "YES" : "NO");

    }
}
