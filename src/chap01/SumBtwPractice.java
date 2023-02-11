package chap01;

import java.util.Scanner;

public class SumBtwPractice {
    static int sumof(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a의 값: ");
        int a = stdIn.nextInt();

        System.out.print("b의 값: ");
        int b = stdIn.nextInt();

        if (a < b){
            System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(a, b));
        }else {
            System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(b, a));
        }


    }
}
