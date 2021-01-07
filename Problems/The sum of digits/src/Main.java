import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 100;
        int c = a % 10;
        int d = (a - b * 100 - c) / 10;

        System.out.print(b + c + d);
    }
}
