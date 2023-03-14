public class Reverse {

    public static String reverse(String source) {
        StringBuilder s = new StringBuilder(source);
        s.reverse();

        return s.toString();
    }

    public static void main(String[] args) {
        String source = "my name Kyryl";
        System.out.println(reverse(source));
    }
}