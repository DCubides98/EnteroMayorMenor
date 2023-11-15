import java.util.Scanner;

public class EnteroMayorMenor {

public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa el primer numero entero: ");
    int num1 = scanner.nextInt();

    System.out.println("Ingresa el segundo numero entero: ");
    int num2 = scanner.nextInt();

    System.out.println("Ingresa el tercer numero entero: ");
    int num3 = scanner.nextInt();

    if (num1==num2 && num2==num3){
        System.out.println("Los 3 numeros son iguales");
    } else {

        //Math.min se utiliza para encontrar el valor mínimo entre dos o más valores.
        int menor = Math.min(Math.min(num1, num2), num3);

        //Math.max se utiliza para encontrar el valor máximo entre dos o más valores.
        int mayor = Math.max(Math.max(num1, num2), num3);

        System.out.println("El menor número es: " + menor);
        System.out.println("El mayor número es: " + mayor);
    }

    scanner.close();
}

}