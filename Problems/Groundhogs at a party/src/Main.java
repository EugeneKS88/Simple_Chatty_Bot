import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reeseCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean a = reeseCups >= 10 && reeseCups <= 20 && !weekend;
        boolean c = reeseCups >= 15 && reeseCups <= 25 && weekend;
        boolean output = a || c;
        System.out.println(output);
    }
}