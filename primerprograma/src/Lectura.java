import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de la lanzamiento de tu pelicula favorita");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo dinos que nota le das a esta pelicula");
        double nota = teclado.nextDouble(); /*para la nota en double necesitas usar (,) y no punto (.)*/

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
