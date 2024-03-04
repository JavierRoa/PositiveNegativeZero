import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su número:");
        int valor = input.nextInt();
        checkNumber(valor);
    }
    public static void checkNumber(int number) {
        if(number>0) {
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
