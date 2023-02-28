import java.util.Scanner;

public class SymbolOccurance {
    public static void main(String[] args) {
        System.out.print("Input string: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("How many times: " + count(s, 'q'));


    }

    private static long count(String s, char c){
        return s.chars().filter(x->x==c).count();
    }

}
