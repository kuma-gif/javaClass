import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter C");
        double c = kb.nextDouble();
        double f = 1.8 * c + 32;
        double k =  c + 273.15;
        System.out.println("Enter F: " + f);
        System.out.println("Enter k: " + k);
    }
}

