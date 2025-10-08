public class laba2 {
    public static double primer1(double x, double a, double b) {
        if (x <= 3) {
            return b + 2 * Math.log(x);
        } else {
            return Math.pow(x, 2) + a;
        }
    }

    public static void main(String[] args) {
        double xValue = 4.5;
        double aValue = 3.0;
        double bValue = 1.0;

        double result = primer1(xValue, aValue, bValue);

        System.out.println("При x = " + xValue + ", a = " + aValue + ", b = " + bValue + ", y = " + result);

        xValue = 4.0;
        result = primer1(xValue, aValue, bValue);
        System.out.println("При x = " + xValue + ", a = " + aValue + ", b = " + bValue + ", y = " + result);
    }
}