/**
 * Created by Jessica on 2016/11/30.
 */

/**
 * Purpose: calculate greatest common divisor of two recursively
 * Input: two integer
 * Output: greatest common divisor of two number
 */
public class GCD {

    public static void main(String[] args) {
        System.out.println(Gcd(12,4));
        System.out.println(Gcd(-2,-4));
        System.out.println(Gcd(5,0));
        System.out.println(Gcd(15,3));
    }

    /**
     * assume a>b>=0
     * @param a
     * @param b
     * @return
     */
    private static int Gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return Gcd(b, Math.floorMod(a, b));
    }
}

