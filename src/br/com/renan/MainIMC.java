
package br.com.renan;

import java.util.Scanner;

public class MainIMC {
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DE CÁLCULO DE IMC === \n");
        Pessoa p1 = new Pessoa ();
        
        String nome = lerNome();
        p1.setNome(nome);
        
        float peso = lerPeso();
        p1.setPeso (peso);
        
        float altura = lerAltura();
        p1.setAltura(altura);
        
        String nome1 = p1.getNome();
        float peso1 = p1.getPeso();
        float altura1 = p1.getAltura();
        float IMC = p1.calcularIMC(peso1, altura1);
        String categoria = p1.informarCategoriaIMC(IMC);
        p1.exibirDados(nome1, categoria);
    }
    
    public static String lerNome() {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o seu nome: ");
        String nome = console.next();
        nome = nome.toUpperCase();
        return nome;
    }
    
    public static float lerPeso() {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o seu peso: ");
        float peso = console.nextFloat();
        return peso;
    }
    
    public static float lerAltura() {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite a sua altura: ");
        float altura = console.nextFloat();
        return altura;
    }


    
}
