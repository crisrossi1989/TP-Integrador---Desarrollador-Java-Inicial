public class Ronda {
    //Atributos
    int nroRonda=1;
    Partido partidos[];


    //Constructor

    public Ronda(int nro, Partido[] partidos) {
        this.nroRonda=nro;
        this.partidos = partidos;
    }

    //Metodos

    public void setPartidos(Partido[] partidos) {
        this.partidos = partidos;
    }

    public int puntosTotales(Pronostico pron){
        pron.calcularPuntos();
        return pron.getPuntos();
    }
}
