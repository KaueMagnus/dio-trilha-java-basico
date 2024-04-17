public class Carro extends Veiculo {

    public void ligar() {
        conferindoCombustivel();
        conferirCambio();
        System.out.println("Carro ligado!");
        System.out.println("Chassi: " + getChassi());
    }

    private void conferirCambio() {
        System.out.println("Conferindo cambio em P!");
    }
    private void conferindoCombustivel() {
        System.out.println("Conferindo combustivel!");
    }
}
