//Autor: Renan Bonini
package br.com.renan;

import java.util.Scanner;

public class MainTV {

    //recebe o objeto criado em criarTV(), apresenta o menu e a funcao menu()
    //o menu fica em loop até que o usuario escolha sair
    public static void main(String[] args) {
        TV tv = criarTV();
        boolean sair;
        do {
            apresentarMenu();
            int opcaoMenu = receberOpcao();
            sair = menu(opcaoMenu, tv);
        } while (sair == false);

    }

    //cria o objeto TV
    public static TV criarTV() {
        TV tv = new TV();
        return tv;
    }

    //apresenta as opcoes de compostas no menu
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

    //recebe a opcao desejada pelo usuario para ser introduzida na funcao menu()
    public static int receberOpcao() {
        Scanner console = new Scanner(System.in);
        int opcao = 0;
        try {
            System.out.print("\nDigite a opção desejada: ");
            opcao = console.nextInt();
            System.out.println("==========================");
        } catch (Exception ex) {
        }
        return opcao;

    }

    //menu que tem a funcao de chamar os metodos do objeto TV
    //@param opcao - opcao digitada pelo usuario na funcao receberOpcao()
    //@param tv - objeto TV criado em criarTV() e instanciado no main
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
                int canal = lerCanal(tv);
                tv.setCanal(canal);
                break;
            case 4:
                if (tv.isLigada()) {
                    tv.exibirCanal();
                } else {
                    System.out.println("\n** A TV está desligada! **");
                }
                break;
            case 5:
                if (tv.isLigada()) {
                    if (tv.getVolume() < 20) {
                        tv.aumentarVolume();
                    } else {
                        System.out.println("\n** O volume está no máximo! **");
                    }
                } else {
                    System.out.println("\n** A TV está desligada! **");
                }
                break;
            case 6:
                if (tv.isLigada()) {
                    if (tv.getVolume() > 0) {
                        tv.diminuirVolume();
                    } else {
                        System.out.println("\n** O volume está no mínimo! **");
                    }
                } else {
                    System.out.println("\n** A TV está desligada! **");
                }
                break;
            case 7:
                if (tv.isLigada()) {
                    tv.exibirVolume();
                } else {
                    System.out.println("\n** A TV está desligada! **");
                }
                break;
            case 8:
                tv.verificarTV();
                break;
            case 9:
                System.out.println("\n=== PROGRAMA FECHADO ===");
                sair = true;
                break;
            default:
                System.out.println("\n ** Opção inválida! **");
                break;
        }
        return sair;
    }

    //recebe o valor digitado pelo usuario para ser inserido como canal
    //@param tv - objeto criado no main
    public static int lerCanal(TV tv) {
        int canal;
        boolean sair = false;
        if (tv.isLigada()) {
            while (sair == false) {
                try {
                    Scanner console = new Scanner(System.in);
                    System.out.print("\nDigite o canal desejado (0 a 99): ");
                    canal = console.nextInt();
                    if (canal >= 0 && canal <= 99) {
                        System.out.println("\n==========================");
                        System.out.println("\n** Canal alterado! **");
                        return canal;
                    } else {
                        System.out.println("\n** Este canal não existe! **");
                    }
                } catch (Exception ex) {
                    System.out.println("\n** Entrada inválida! **");
                }
            }
        } else {
            System.out.println("\n** A TV está desligada! **");
        }
        return 0;
    }

}
