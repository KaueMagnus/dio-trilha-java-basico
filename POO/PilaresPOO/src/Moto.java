public class Moto extends Veiculo {
    @Override
    public void ligar() {
        conferirPezinho();
        conferirCambio();
        System.out.println("Moto ligada!");
        System.out.println("Chassi: " + getChassi());
    }

    private void conferirPezinho() {
        System.out.println("Conferindo o pezinho!");
    }
    private void conferirCambio() {
        System.out.println("Conferindo cambio em N");
    }
}
