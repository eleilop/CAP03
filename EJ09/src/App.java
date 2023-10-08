import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del cono: ");
        double radio = sc.nextDouble();
        System.out.print("Introduce la altura del cono: ");
        double altura = sc.nextDouble();
        sc.close();
        double volumen = (3.141592653689793*(radio*radio)*altura)/3;
        System.out.println("El volumen de un cono de radio "+radio+" y altura "+altura+" es "+volumen);
    }
}
