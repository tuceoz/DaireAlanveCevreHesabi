import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double r, pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını girin : ");
        r = input.nextDouble();

        alan = r * r * pi;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

    }
}