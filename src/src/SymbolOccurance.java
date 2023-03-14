import java.util.Scanner;

public class SymbolOccurance {
    public static void main(String[] args) {
        System.out.print("Input string: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("How many times: " + findSymbolOccurance(s, 'q'));

    }

    public static int findSymbolOccurance(String input, char symbol) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }

}
