import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("Leap");
        } else System.out.println("Regular");
    }
}