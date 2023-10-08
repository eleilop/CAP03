import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        sc.close();
        System.out.println("La suma de "+num1+" + "+num2+" = "+(num1+num2));
        System.out.println("La resta de "+num1+" - "+num2+" = "+(num1-num2));
        System.out.println("La multiplicación de "+num1+" * "+num2+" = "+(num1*num2));
        System.out.println("La división de "+num1+" / "+num2+" = "+(num1/num2));
    }
}
