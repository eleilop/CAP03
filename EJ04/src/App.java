import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        sc.close();
        System.out.printf("La suma de %.1f + %.1f = "+(num1+num2)+"%n", num1, num2);
        System.out.printf("La resta de %.1f - %.1f = "+(num1-num2)+"%n", num1, num2);
        System.out.printf("La multiplicación de %.1f * %.1f = "+(num1*num2)+"%n", num1, num2);
        System.out.printf("La división de %.1f / %.1f = "+(num1/num2)+"%n", num1, num2);
    }
}
