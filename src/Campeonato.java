import java.util.ArrayList;

public class Campeonato {
    public static void main(String[] args) {
        ArrayList<CocheDeCarreras> lista = new ArrayList<>();

        lista.add(new PrototipoLM("BMW", "111", 320, true));
        lista.add(new PrototipoLM("Lamborghini", "222", 320, true));
        lista.add(new GranTurismo("Mercedes", "333", 300, 50));
        lista.add(new GranTurismo("Ferrari", "444", 300, 50));

        for (CocheDeCarreras coche : lista) {
            coche.mostrarDatos();
            coche.competir();
            System.out.println();
        }
    }
}