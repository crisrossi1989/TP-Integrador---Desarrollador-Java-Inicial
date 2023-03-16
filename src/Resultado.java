public class Resultado{

    //Metodos
    public String calcularResultado(int golesEL,int golesEV){
        if(golesEL==golesEV){
            return"Empate";
        }else{
            if (golesEL>golesEV){
                return "Gana el local";
            }else{
                return "Gana el visitante";
            }
        }
    }
}
