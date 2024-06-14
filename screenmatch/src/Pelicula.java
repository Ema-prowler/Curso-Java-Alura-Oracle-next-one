public class Pelicula {

    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    Boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("EL nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duracion es: " + duracionEnMinutos);

    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

}
