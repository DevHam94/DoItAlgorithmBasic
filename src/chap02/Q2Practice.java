package chap02;

import java.util.Scanner;
import java.util.Arrays;

public class Q2Practice {
    static void reverseArray(int[] a){
        for(int i = 0; i < a.length / 2; i++){
            System.out.println(Arrays.toString(a));
            int temp = 0;
            temp = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = temp;
            System.out.println("a[" + i + "]과 a[" + (a.length - i - 1) + "]을 교환합니다.");
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 1, 3, 9, 6, 7};

        reverseArray(a);
    }
}
