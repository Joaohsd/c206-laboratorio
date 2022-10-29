public class Main {
    public static void main(String[] args) {
        SomAmbiente somAmbiente = new SomAmbiente();
        Mapa mapa = new Mapa();

        somAmbiente.start();
        mapa.start();
    }
}
