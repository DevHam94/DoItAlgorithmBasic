package chap01;

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("n값: ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++){
            System.out.print(i + " + ");
            sum += i;
        }

        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);
    }
}
