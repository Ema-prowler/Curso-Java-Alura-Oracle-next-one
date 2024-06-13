import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("*********************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("El saldo disponible es: " + saldo + "$");
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
            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Cual es el monto que desea retirar?");
                    double valorAretirar = teclado.nextDouble();
                    if (valorAretirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo = saldo - valorAretirar;
                        System.out.println("Saldo actualizado: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el monto que desea depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo = saldo + valorDepositar;
                    System.out.println("Saldo actualizado: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("El programa a terminado");
                    break;
                default:
                    System.out.println("Opcion invalida Seleccione una opcion valida (1-2-3-9)");
            }
        }
    }
}
