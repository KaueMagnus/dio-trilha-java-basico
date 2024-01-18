public class ComparacaoAvancada {
    public static void main(String[] args) {

        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true

        numero1 = 130;
        numero2 = 125;
        System.out.println(numero1 == numero2); //false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals

        System.out.println(java.util.Objects.equals(numero1, numero2));
    }
}
