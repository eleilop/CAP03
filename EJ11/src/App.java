import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de Kb: ");
        long kb = sc.nextLong();
        sc.close();
        long mb = kb/1000;
        System.out.println(kb+" Kb son "+mb+" Mb");
    }
}
