import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long n = 1;
        int k = 1;
        while (m >= n) {
            n *= k;
            k++;
        }
        System.out.println(k -1);
    }
}