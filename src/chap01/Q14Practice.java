package chap01;

public class Q14Practice {
    static void triangleLB(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){
        for (int i = 0; i < n; i++){
            for (int j = n - i - 1; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n ){
        for (int i = 0; i < n; i++){
            System.out.print(" ".repeat(i));
            for (int j = n - i - 1; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n){
        for (int i = 0; i < n; i++){
            System.out.print(" ".repeat(n-i-1));
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        triangleRB(n);
    }
}
