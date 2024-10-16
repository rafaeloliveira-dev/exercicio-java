import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o raio do circulo: ");
    double raio = sc.nextDouble();

    sc.close();

    // double area = 3.14 * raio * raio;

    final double PI = 3.14;

    double area = PI * Math.pow(raio, 2);

    System.out.printf("ÁREA DO CÍRCULO %.2f", area);


    }
}
