import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] equipo;
        String archivoPronostico, archivoResultado;
        int posPrimerComaPron, posPimerComaResul;
        Equipo equipoL;
        Equipo equipoV;
        Pronostico prono=new Pronostico();
        int apuesta;
        Ronda ronda=new Ronda(1,null);
        Partido partido[]=new Partido[2];
        int puntosTotales=0;

        List<String> allLines = Files.readAllLines(Paths.get(".\\resultados.csv"));
        for (int j = 1; j < allLines.size(); j++) {
            archivoResultado = allLines.get(j);
            equipo=archivoResultado.split(",");
            posPimerComaResul = (archivoResultado.indexOf(','));
            int goll=Character.getNumericValue((archivoResultado.charAt(posPimerComaResul+1)));
            int golv=Character.getNumericValue((archivoResultado.charAt(posPimerComaResul+3)));

            equipoL = new Equipo(equipo[0]);
            equipoV = new Equipo(equipo[3]);
            partido[j-1] = new Partido(equipoL,equipoV,goll,golv);
        }

        ronda.setPartidos(partido);

        List<String> readAllLines = Files.readAllLines(Paths.get(".\\pronostico.csv"));
        for (int i = 1; i < readAllLines.size(); i++) {
            archivoPronostico = readAllLines.get(i);
            posPrimerComaPron = (archivoPronostico.indexOf(','));
            if (archivoPronostico.charAt(posPrimerComaPron + 1) == 'X') {
                apuesta=1;
            }else {
                if (archivoPronostico.charAt(posPrimerComaPron + 2) == 'X') {
                    apuesta=2;
                }else {
                    apuesta=3;
                }
            }
            prono.setApuesta(apuesta);
            prono.setPartidoApostado(partido[i-1]);
            puntosTotales = ronda.puntosTotales(prono);
        }
        System.out.println(puntosTotales);
    }
}
