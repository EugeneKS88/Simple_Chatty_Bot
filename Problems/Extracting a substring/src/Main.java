import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int beginIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        String output = input.substring(beginIndex, endIndex + 1);
        System.out.println(output);
    }
}