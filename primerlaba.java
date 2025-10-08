import java.util.Scanner;

public class primerlaba {
    public static double primer9(double x, double a, double b) {
        if (x >= 2) {
            return Math.sqrt(1 + x * Math.sqrt(a * x));
        } else {
            return a * Math.sin(b * x) + 3;
        }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double xValue = scanner.nextDouble();

        System.out.print("Введите значение a: ");
        double aValue = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double bValue = scanner.nextDouble();

        double result = primer9(xValue, aValue, bValue);

        System.out.println("При x = " + xValue + ", a = " + aValue + ", b = " + bValue + ", y = " + result);

        scanner.close();
    }
}