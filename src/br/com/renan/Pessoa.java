//Autor: Renan Bonini
package br.com.renan;

public class Pessoa {

    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.peso = 0.0f;
        this.altura = 0.0f;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularIMC(float peso, float altura) {
        float IMC;
        IMC = peso / (altura * altura);
        return IMC;
    }

    public String informarCategoriaIMC(float IMC) {
        if (IMC < 18.5) {
            return "Abaixo do peso.";
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            return "com Peso Ideal.";
        } else if (IMC >= 25.0 && IMC < 29.9) {
            return "com Sobrepeso.";
        } else if (IMC >= 30.0 && IMC < 34.9) {
            return "com Obesidade Grau I.";
        } else if (IMC >= 35.0 && IMC < 39.9) {
            return "com Obesidade Grau II.";
        } else if (IMC >= 40) {
            return "com Obesidade Grau III.";
        } else {
            return null;
        }
    }
    
    public void exibirDados (String nome, String IMC) {
        System.out.printf("\nResultado: %s está %s \n", nome, IMC);
    }

}
