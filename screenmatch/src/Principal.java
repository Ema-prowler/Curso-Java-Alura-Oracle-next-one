import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());

        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula(); /*Para crear otra pelicula hay que crear una nueva instancia de la clase com.aluracursos.screenmatch.modelos.Pelicula*/

//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//
//       otraPelicula.muestraFichaTecnica();


    }
}
