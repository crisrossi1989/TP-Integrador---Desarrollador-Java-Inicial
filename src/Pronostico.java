public class Pronostico {

    //Atributos

    private Partido partidoApostado;
    private int apuesta;
    private int puntos=0;

    //Constructor

    public Pronostico() {
    }

   /* public Pronostico(Partido partidoApostado, int apuesta) {
        this.partidoApostado = partidoApostado;
        this.apuesta = apuesta;
    }*/


    //Metodos


    public void setPartidoApostado(Partido partidoApostado) {
        this.partidoApostado = partidoApostado;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void calcularPuntos(){

        if(partidoApostado.getResultado()==apuesta){
            puntos++;
        }
    }
}
