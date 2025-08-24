public class Quadratic {
    public static void main(String[] args) {
    // only works when f(x) is of the type x^2 + bx + c //
    double b = Double.parseDouble(args[0]);
    double c = Double.parseDouble(args[1]);
    double disc = Math.sqrt(b*b - 4.0*c);
    double x = (-b + disc)/2.0;
    double y = (-b - disc)/2.0;
    System.out.println(x);
    System.out.println(y);
    }
}