package chap01;

public class Q15Practice {
    static void spira(int n){
        for(int i = 1; i <= n; i++){
            int num = (i - 1) * 2 + 1;
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(num));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spira(4);
    }

}
