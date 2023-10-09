import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        double base = sc.nextDouble();
        sc.close();
        double total = 121*base/100;
        System.out.printf("El total (base+IVA) es de %.2f euros", total);
    }
}
