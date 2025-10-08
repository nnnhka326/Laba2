import java.util.Scanner;
public class primer2 {
    public static double calculateFunction(double x, double a, double b) {
        if (x > 0) {
            return a + (1 / Math.exp(x));
        } else {
            return Math.cos(b * x + 1);
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

        double result = calculateFunction(xValue, aValue, bValue);
        System.out.println("При x = " + xValue + ", a = " + aValue + ", b = " + bValue + ", y = " + result);

        scanner.close();
    }
}