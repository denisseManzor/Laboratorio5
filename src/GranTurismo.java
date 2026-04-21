public class GranTurismo extends CocheDeCarreras {
    private int pesoExtraLastre;

    public GranTurismo(String marca, String modelo, int velocidadMaxima, int pesoExtraLastre) {
        super(marca, modelo, velocidadMaxima);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    public void competir() {
        System.out.println("Conduce con lastre extra de " + pesoExtraLastre + " kg");
    }
}