import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long H = sc.nextLong();

            if (H == 0) { 
                break;
            }

            long x = H;
            long max = H;

            while (x != 1) {
                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    x = 3 * x + 1;
                }

                if (x > max) {
                    max = x;
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}