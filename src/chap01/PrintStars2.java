package chap01;

import java.util.Scanner;

public class PrintStars2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n, w;
        n = stdIn.nextInt();
        w = stdIn.nextInt();

        for(int i = 0; i < n / w; i++){
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));
    }
}
