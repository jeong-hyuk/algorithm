//백준 No.3003 킹, 퀸, 룩, 비숍, 나이트, 폰

//자릿수 구하기는 일의자리, 십의자리, 백의자리 등 아래에 나와있는 first, second, third의 순으로 구한다.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int first = a * (b%10);
        int second = a * (b%100/10);
        int third = a * (b%1000/100);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(a*b);
    }
}
