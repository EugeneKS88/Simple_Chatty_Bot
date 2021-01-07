import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean b = (a < 10) && (a > 0);
        System.out.println(b);
    }
}
