package chap01;

public class Q16Practice {
    static void npira(int n){
        for(int i = 1; i <= n; i++){
            for (int j = n - i; j >=0; j--){
                System.out.print(" ");
            }

            int num = (i - 1) * 2 + 1;

            for (int j = 1; j <= num; j++){
                System.out.print(i%10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        npira(4);
    }
}
