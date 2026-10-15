public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) {
        if (denominator==0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен 0");
        }
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public int getNumerator() { return numerator; }
    public int getDenominator() { return denominator; }
    private static int gcd(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);
        while (b!=0) {
            int t=b;
            b=a%b;
            a=t;
        }
        return a==0?1:a;
    }
    private Fraction reduce(int num, int den) {
        if (den<0) { num=-num; den=-den; }
        int g=gcd(num, den);
        return new Fraction(num/g, den/g);
    }
    public Fraction sum(Fraction other) {
        return reduce(this.numerator*other.denominator+other.numerator*this.denominator, this.denominator*other.denominator);
    }
    public Fraction minus(Fraction other) {
        return reduce(this.numerator*other.denominator-other.numerator*this.denominator, this.denominator*other.denominator);
    }
    public Fraction mult(Fraction other) {
        return reduce(this.numerator*other.numerator, this.denominator*other.denominator);
    }
    public Fraction div(Fraction other) {
        if (other.numerator==0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return reduce(this.numerator*other.denominator, this.denominator*other.numerator);
    }
    public Fraction sum(int x) { return sum(new Fraction(x, 1)); }
    public Fraction minus(int x) { return minus(new Fraction(x, 1)); }
    public Fraction mult(int x) { return mult(new Fraction(x, 1)); }
    public Fraction div(int x) { return div(new Fraction(x, 1)); }
    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}
