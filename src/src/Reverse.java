public class Reverse {

    public static StringBuilder reverse(String source){
        String s1 = source;
        StringBuilder s = new StringBuilder();
        s.append(s1);
        s.reverse();


        return s;
    }


    public static void main(String[] args) {
        String text = "my name Kyryl";
        System.out.println(reverse(text));
    }
}