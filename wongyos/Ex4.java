import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("x: ");
        int x = kb.nextInt();
        System.out.println("y: ");
        int y = kb.nextInt();
        int d = 0;
        if (x > y) { 
            d = x - y;
        } else {
            d = y - x;
        }
        System.out.print("Difference: " + d);
    }
}
