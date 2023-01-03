//백준 No.2525 오븐 시계

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt() + sc.nextInt();

        while (minute > 59) {
            hour++;
            minute -= 60;
        }
        while (hour > 23)
            hour -= 24;
        System.out.printf("%d %d", hour, minute);
    }
}
