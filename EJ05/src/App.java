import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del rectángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();
        sc.close();
        double area = base*altura;
        System.out.printf("El área de un rectángulo de base %.2f y altura %.2f es %.2f", base, altura, area);
    }
}