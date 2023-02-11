package chap01;

public class Min3Practice {

    static int min3(int a, int b, int c){
        int min = a;
        if( a < min) min = a;
        if( b < min) min = b;
        if( c < min) min = c;

        return min;
    }
}
