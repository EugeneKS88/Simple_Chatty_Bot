import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = 0;
        int s = 0;
        int p = 0;

        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            int sequence = scanner.nextInt();

            if (sequence == 1) {
                l = ++l;
            } else if (sequence == -1) {
                s = ++s;
            } else if (sequence == 0) {
                p = ++p;
            }
        }

        System.out.println(p + " " + l + " " + s);
    }
}