public class PrototipoLM extends CocheDeCarreras {
    private boolean sistemaHibrido;

    public PrototipoLM(String marca, String modelo, int velocidadMaxima, boolean sistemaHibrido) {
        super(marca, modelo, velocidadMaxima);
        this.sistemaHibrido = sistemaHibrido;
    }

    public void competir() {
        if (sistemaHibrido) {
            System.out.println("Compite con sistema hibrido");
        } else {
            System.out.println("Compite con motor de combustion");
        }
    }
}