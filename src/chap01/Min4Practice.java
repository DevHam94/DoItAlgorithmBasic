package chap01;

public class Min4Practice {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if( a < min) min = a;
        if( b < min) min = b;
        if( c < min) min = c;
        if( d < min) min = d;

        return min;
    }
}
