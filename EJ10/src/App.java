import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de Mb: ");
        long mb = sc.nextLong();
        sc.close();
        long kb = mb*1000;
        System.out.println(mb+" Mb son "+kb+" Kb");
    }
}
