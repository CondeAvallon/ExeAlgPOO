
package br.com.renan;

public class MainIMC {
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAMA DE CÁLCULO DE IMC === \n");
        System.out.print("Digite o nome do cliente:");
        
        Pessoa p1 = new Pessoa ();
        p1.setNome("Carlos");
        p1.setAltura(1.70f);
        p1.setPeso (76.5f);
        String nome = p1.getNome();
        float peso1 = p1.getPeso();
        float altura1 = p1.getAltura();
        float IMC1 = p1.calcularIMC(peso1, altura1);
        String IMC = p1.informarCategoriaIMC(IMC1);
        p1.exibirDados(nome, IMC);
    }
    
    public void lerNome () {
        
    }
    
}
