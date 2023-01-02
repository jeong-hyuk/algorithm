//백준 No.2884 알람 시계

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int H, M;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();

        if(M < 45) {
            H--;
            M += 15;

            if (H < 0) {
                H = 23;
            }
            System.out.println(H + " " + M);
        }else
            System.out.println(H + " " + (M -45));
    }
}
