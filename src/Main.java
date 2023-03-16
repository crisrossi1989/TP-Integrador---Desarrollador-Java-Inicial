import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args)throws IOException {
        String linea="";


        List<String> readAllLines = Files.readAllLines(Paths.get(".\\pronostico.csv"));
        for (int i = 1; i < readAllLines.size(); i++) {
            linea = readAllLines.get(i);
            System.out.println(linea);
        }


       /* for (String linea : Files.readAllLines(Paths.get(".\\resultados.csv"))){   //datos sin tratar
            System.out.println(linea);

        */
    }
}