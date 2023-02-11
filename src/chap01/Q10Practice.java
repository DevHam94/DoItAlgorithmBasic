package chap01;

import java.util.Scanner;

public class Q10Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("양의 정수: ");
        int n;
        do{
            n = stdIn.nextInt();
        }while(n <= 0);

        int num = 1; //자릿수

        do{
            n /= 10;
            num++;
        }while(n >= 10);

        System.out.println("그 수는 " + num + "자리입니다.");
    }
}
