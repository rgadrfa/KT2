package section3;

public class Solve2 {

    public static double pow(double a, int n){
        if (n == 1) return a;
        return a * pow(a,n-1);
    }
}
