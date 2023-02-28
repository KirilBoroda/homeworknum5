public class WordPosition {
    public static void main(String[] args) {
        System.out.println(findWordPosition("Ararat","rarat"));
    }
    public static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        } else {
            return -1;
        }
    }
}
