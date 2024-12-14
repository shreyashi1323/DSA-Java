package oops;

public class Fravtion {
    public static class Frac {
        int num;
        int den;

        public static Frac add(Frac f1, Frac f2) {
            int numerator = f1.num * f2.den + f1.den * f2.num;
            int denominator = f1.den * f2.den;
            Frac f3 = new Frac(numerator, denominator);
            f3.simplify();
            return f3;
        }

        public Frac(int num, int den) {
            this.num = num;
            this.den = den;
            simplify();
        }

        public void simplify() {
            int hcf = gcd(num, den);
            num /= hcf;
            den /= hcf;
        }
    }

    public static int gcd(int num, int den) {
        int min = Math.min(num, den);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) return i;
        }
        return min;
    }

    public static void main(String[] args) {
        Frac f1 = new Frac(1, 2);
        System.out.println(f1.num + "/" + f1.den);

        Frac f2 = new Frac(1, 2);
        System.out.println(f2.num + "/" + f2.den);

        Frac f3 = Frac.add(f1, f2);
        System.out.println(f3.num + "/" + f3.den);
    }
}
