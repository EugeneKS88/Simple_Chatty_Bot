import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = 1;
        int i = 1;

        while (result <= n) {
            result = i * i;
            if (result <= n)
                System.out.println(result);
            i++;
        }
    }
}