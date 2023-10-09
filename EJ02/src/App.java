import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de euros: ");
        double euros = sc.nextDouble();
        sc.close();
        double pesetas = euros*166.386;
        System.out.printf("%.2f euros son %d pesetas", euros, (int)Math.round(pesetas));
    }
}
