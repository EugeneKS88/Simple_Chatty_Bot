import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = 0;
        int n = 0;
        int bridge = 0;
        boolean crash = false;

        if (sc.hasNext()) {
            height = sc.nextInt();
        }
        if (sc.hasNext()) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                bridge = sc.nextInt();
            }

            if (bridge <= height) {
                i++;
                System.out.println("Will crash on bridge " + i);
                crash = true;
                break;
            }
        }
        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}