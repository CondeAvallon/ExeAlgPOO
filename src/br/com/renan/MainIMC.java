//Autor: Renan Bonini
package br.com.renan;

import java.util.Scanner;

public class MainIMC {
    
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DE CÁLCULO DE IMC === \n");
        Pessoa pessoa = new Pessoa ();
        
        //instacia o nome, peso e altura e os define no objeto pessoa
        String nome = lerNome();
        pessoa.setNome(nome);
        float peso = lerPeso();
        pessoa.setPeso (peso);
        float altura = lerAltura();
        pessoa.setAltura(altura);
        
        /*pega o nome, peso e altura do objeto pessoa para calcular o IMC
        com o metodo calcularIMC() e depois informa a categoria da pessoa com
        o metodo informarCategoriaIMC()
        */
        String nome1 = pessoa.getNome();
        float peso1 = pessoa.getPeso();
        float altura1 = pessoa.getAltura();
        float IMC = pessoa.calcularIMC(peso1, altura1);
        String categoria = pessoa.informarCategoriaIMC(IMC);
        pessoa.exibirDados(nome1, categoria);
    }
    
    //le o nome que da pessoa para que seja identificada
    public static String lerNome() {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o seu nome: ");
        String nome = console.next();
        nome = nome.toUpperCase();
        return nome;
    }
    
    //le o peso da pessoa que sera utilizado para calcular o IMC
    public static float lerPeso() {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o seu peso: ");
        float peso = console.nextFloat();
        return peso;
    }
    
    //le a altura da pessoa que sera utilizada para calcular o IMC
    public static float lerAltura() {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite a sua altura: ");
        float altura = console.nextFloat();
        return altura;
    }


    
}
