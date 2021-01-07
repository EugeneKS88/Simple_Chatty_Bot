import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double sum = 0;
        double count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }

        double average = sum / count;
        System.out.println(average);
    }
}