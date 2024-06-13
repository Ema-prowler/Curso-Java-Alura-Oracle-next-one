import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double Saldo = 1599.99;
        int opcion = 0;

        System.out.println("*********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo disponible es: " + Saldo + "$");
        System.out.println("\n*********************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

        }
    }
}
