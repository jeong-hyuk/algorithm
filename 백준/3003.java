//백준 No.3003 킹, 퀸, 룩, 비숍, 나이트, 폰

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();

        a = 1-a;
        b = 1-b;
        c = 2-c;
        d = 2-d;
        e = 2-e;
        f = 8-f;

        System.out.printf("%d %d %d %d %d %d", a, b, c, d, e, f);
    }
}
