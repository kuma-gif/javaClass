import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // รับค่าพิกัดจุดที่ 1
        System.out.print("กรุณาใส่ค่า x1: ");

        int x1 = kb.nextInt();
        System.out.print("กรุณาใส่ค่า y1: ");

        int y1 = kb.nextInt();
        // รับค่าพิกัดจุดที่ 2
        System.out.print("กรุณาใส่ค่า x2: ");

        int x2 = kb.nextInt();
        System.out.print("กรุณาใส่ค่า y2: ");
        double y2 = kb.nextInt();

        // คำนวณความยาว
        double jarak = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // แสดงผลลัพธ์
        System.out.printf("ความยาวระหว่างจุดสองจุดคือ หน่วย", jarak);
    }
}
