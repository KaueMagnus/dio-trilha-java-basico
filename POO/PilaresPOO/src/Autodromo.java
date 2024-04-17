public class Autodromo {
    public static void main(String[] args) {
        Carro corolla = new Carro();

        corolla.setChassi("6234RG2");
        corolla.ligar();

        System.out.println();
        Moto z1000 = new Moto();

        z1000.setChassi("324HL34");
        z1000.ligar();

        //Veiculo coringa = corolla;

        //coringa.ligar();

    }
}
