package chap01;

import java.util.Scanner;

public class Q13Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이: ");
        int n = stdIn.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("*".repeat(n));
            System.out.println();
        }
    }
}
