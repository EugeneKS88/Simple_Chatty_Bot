import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;


        for (int i = 0; i < n; i++) {
            int a = input.nextInt();

            if (a > max && a % 4 == 0) {
                max = a;
            }

        }
        System.out.println(max);
    }
}