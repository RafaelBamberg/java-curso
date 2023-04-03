import java.util.Scanner;

public class Classes {
    public static void casting(String[] args) {
        int a, b;
        double resultado;
        a = 5;
        b = 2;

        resultado = (double) a / b;
        System.out.print(resultado);
    }

    public static void scanner(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;

        x = sc.next();
        System.out.println("Voce digitou: " + x);

        sc.close();
    }

    public static void scanner2(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt();
        System.out.println("Voce digitou: " + x);

        sc.close();
    }
}
