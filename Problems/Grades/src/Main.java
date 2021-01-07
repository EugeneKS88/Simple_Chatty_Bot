import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            int sequence = scanner.nextInt();

            if (sequence == 2) {
                d = ++d;
            } else if (sequence == 3) {
                c = ++c;
            } else if (sequence == 4) {
                b = ++b;
            } else if (sequence == 5) {
                a = ++a;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}