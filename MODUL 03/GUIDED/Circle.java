public class Circle {
    public static final double PI = 3.14159;
    public double r;

    public Circle(double r) {
        this.r = r;
    }

    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }

    public double area() {
        return PI * r * r;
    }

    public double circumference() {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        System.out.println("Luas     : " + c.area());
        System.out.println("Keliling : " + c.circumference());
    }
}