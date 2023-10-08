import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double altura = sc.nextDouble();
        sc.close();
        double area = (base*altura)/2;
        System.out.println("El área de un triángulo de base "+base+" y altura "+altura+" es "+area);

    }
}
