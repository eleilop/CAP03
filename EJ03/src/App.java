import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de pesetas: ");
        double pesetas = sc.nextDouble();
        sc.close();
        double euros = pesetas/166.386;
        System.out.println(pesetas+" pesetas son "+euros+" euros");
    }
}