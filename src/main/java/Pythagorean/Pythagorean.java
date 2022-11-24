package Pythagorean;

public class Pythagorean {
    private double a;
    private double b;

    public Pythagorean(double a, double b) {
        this.a = a*a;
        this.b = b*b;
    }

    public double calculatePythagorean() {
        double c = Math.sqrt(this.a + this.b);
        return c;
    }
}
