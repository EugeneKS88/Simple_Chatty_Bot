import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int i1 = input / 1000;
        int i2 = (input - i1 * 1000) / 100;
        int i3 = (input - i1 * 1000 - i2 * 100) / 10;
        int i4 = input % 10;

        if (i1 == i4 && i2 == i3) {
            System.out.println(1);
        } else System.out.println(2);
    }
}