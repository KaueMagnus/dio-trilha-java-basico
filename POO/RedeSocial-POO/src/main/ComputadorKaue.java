package main;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

import java.util.Scanner;

/*
 * Simulação do uso da classe apps.MSNMessenger
 */
public class ComputadorKaue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ServicoMensagemInstantanea smi = null;

    //Não se sabe qual APP, mas qualquer um deverá enviar e receber mensagens.

        System.out.println("Qual aplicativo você deseja utilizar?");
        System.out.println("MSN (msn) - Facebook (fbm) - Telegram (tlg)");
        System.out.println("Digite e selecione o aplicativo pelo conteudo em parenteses: ");
        String appEscolhido = scan.next();

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        } else System.out.println("Aplicativo inválido");

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}