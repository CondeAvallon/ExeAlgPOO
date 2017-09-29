//Autor: Renan Bonini
package br.com.renan;

public class TV {

    private int canal;
    private int volume;
    private boolean ligada;

    public TV() {
        canal = 2;
        volume = 10;
        ligada = false;
    }

    public void ligarTV() {
        ligada = true;
        System.out.println("\n** TV ligada! **");
    }

    public void desligarTV() {
        resetTV();
        System.out.println("\n** TV desligada! **");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("\n** Volume aumentado! **");
        System.out.println("Volume: " + getVolume());
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("\n** Volume diminuído! **");
        System.out.println("Volume: " + getVolume());
    }

    public void exibirCanal() {
        System.out.println("\n** Canal atual: " + getCanal() + " **");
    }

    public void exibirVolume() {
        System.out.println("\n** Volume: " + getVolume() + " **");
    }

    public void verificarTV() {
        if (isLigada()) {
            System.out.println("\n** A TV está ligada. **");
        } else {
            System.out.println("\n** A TV está desligada. **");
        }
    }

    /**
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    public void resetTV() {
        canal = 2;
        volume = 10;
        ligada = false;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
