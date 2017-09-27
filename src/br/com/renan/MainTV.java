package br.com.renan;

import java.util.Scanner;

public class MainTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        boolean sair;
        do {
            apresentarMenu();
            int opcaoMenu = receberOpcao();
            sair = menu(opcaoMenu, tv1);
        } while (sair == false);

    }

    public static void apresentarMenu() {
        System.out.println("\n=====  TV  ===== \n");
        System.out.println("1 - Ligar TV");
        System.out.println("2 - Desligar TV");
        System.out.println("3 - Mudar canal");
        System.out.println("4 - Exibir canal");
        System.out.println("5 - Aumentar volume");
        System.out.println("6 - Diminuir volume");
        System.out.println("7 - Exibir volume");
        System.out.println("8 - Verifica TV");
        System.out.println("9 - Sair");
    }

    public static int receberOpcao() {
        Scanner console = new Scanner(System.in);
        System.out.print("\nDigite a opção desejada: ");
        int opcao = console.nextInt();
        return opcao;

    }

    public static boolean menu(int opcao, TV tv) {
        boolean sair = false;
        switch (opcao) {
            case 1:
                tv.ligarTV();
                break;
            case 2:
                tv.desligarTV();
                break;
            case 3:
                int canal = receberCanal();
                tv.setCanal(canal);
                break;
            case 4:
                tv.exibirCanal();
                break;
            case 5:
                tv.aumentarVolume();
                break;
            case 6:
                tv.diminuirVolume();
                break;
            case 7:
                tv.exibirVolume();
                break;
            case 8:
                tv.verificarTV();
                break;
            case 9:
                System.out.println("\n=== PROGRAMA FECHADO ===");
                sair = true;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        return sair;
    }

    public static int receberCanal() {
        Scanner console = new Scanner(System.in);
        System.out.print("\nDigite o canal desejado: ");
        int canal = console.nextInt();
        return canal;
    }

}
