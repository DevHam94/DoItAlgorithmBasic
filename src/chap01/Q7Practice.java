package chap01;

import java.util.Scanner;

public class Q7Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("n값: ");
        int n = stdIn.nextInt();

        System.out.println("1부터 n까지의 정수 합을 더합니다.");
        int sum = 0;
        sum = (1 + n) * 5;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
