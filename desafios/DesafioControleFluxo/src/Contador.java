import java.util.Scanner;
import excecao.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======DESAFIO CONTROLE DE FLUXO======");
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo a " + i + "ª interação: " + i);
            }
        }
    }

}
