import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int a1 = --a;
        int b1 = --b;
        int c1 = --c;
        int d1 = --d;
        System.out.print(a1);
        System.out.print(" ");
        System.out.print(b1);
        System.out.print(" ");
        System.out.print(c1);
        System.out.print(" ");
        System.out.print(d1);
    }
}