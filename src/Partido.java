public class Partido {
    //Atributos
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesEL;
    private int golesEV;
    private String resultado;

    //Constructor

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, int golesEL, int golesEV) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesEL = golesEL;
        this.golesEV = golesEV;
    }

    //Metodos

    public void setResultado() {
        Resultado res=new Resultado();
        this.resultado = res.calcularResultado(golesEL,golesEV);
    }
}
