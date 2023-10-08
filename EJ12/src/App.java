import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        float examen1 = sc.nextFloat();
        examen1 = 40*examen1/100;
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        float trimestre = sc.nextFloat();
        sc.close();
        float examen2 = 100*(trimestre-examen1)/60;
        System.out.println("Para tener un "+trimestre+" en el trimestre necesitas sacar un "+examen2+" en el segundo examen");
    }
}
