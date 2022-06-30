public class Main {

    static long factorial(int n) {

        long res = 1;

        for(int i = 1; i <= n; ++i) {
            res = res * i;
        }

        return res;
    }

    static boolean is_prime(int num) {

        boolean is_p = true;

        for(int i = 2; i < num; ++i) {
            if(num % i == 0) {
                is_p = false;
            }
        }

        return is_p;
    }

    static long pow(long a, int b) {
        if (b == 0)
            return 1;

        if (b == 1)
            return a;

        if (b % 2 == 0)
            return pow ( a * a, b / 2);
        else
            return a * pow ( a * a, b / 2);
    }

    static long gcd_rec(long a, long b) {
        long res = -1;

        if(a == 0)
            res = b;

        if(a > 0)
            res = gcd_rec(b % a, a);

        return res;
    }

    static long gcd(long a, long b) {

        return a < b ? gcd_rec(a, b) : gcd_rec(b, a);
    }

    static long lcm(long a, long b) {
        long res = a * b;

        return res / gcd(a, b);
    }

    public static void main(String[] args) {

        // Input values
        long a = factorial(6);
        long b = 8 * 7 * 6 / factorial(3);

        // Compute gcd and lcm
        long gcd_r = gcd(a, b);
        long lcm_r = lcm(a, b);

        // Print results
        System.out.println("gcd: " + gcd_r);
        System.out.println("gcd | a && gcd | b: " + (a % gcd_r == 0 && b % gcd_r == 0));
        System.out.println("lcm: " + lcm_r);
        System.out.println("a | lcm && b | lcm: " + (lcm_r % a == 0 && lcm_r % b == 0));
    }
}
