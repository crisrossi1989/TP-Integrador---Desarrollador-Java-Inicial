public class Pronostico {
    //Atributos
    private Partido partidoApostado;
    private int apuesta;
    private int puntos;

    //Constructor

    public Pronostico(Partido partidoApostado, int apuesta) {
        this.partidoApostado = partidoApostado;
        this.apuesta = apuesta;
    }


    //Metodos

    public void calcularPuntos(){

        if(partidoApostado.getResultado()==apuesta){
            puntos++;
        }

    }

}
