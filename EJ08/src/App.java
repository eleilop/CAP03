import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas semanalmente: ");
        int horas = sc.nextInt();
        sc.close();
        int salario = horas*12;
        System.out.println("El salario semanal por "+horas+" horas de trabajo es de "+salario+" euros");
    }
}
