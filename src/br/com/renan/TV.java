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
        System.out.println("TV ligada!");
    }

    public void desligarTV() {
        ligada = false;
        System.out.println("TV desligada!");
    }

    public void aumentarVolume() {
        if (ligada == true) {
            if (volume < 20) {
                volume++;
                System.out.println("\nVolume aumentado!");
                System.out.println("Volume: " + getVolume());
            } else {
                System.out.println("O volume está no máximo.");
            }
        } else {
            System.out.println("\nA TV está desligada!");
        }
    }

    public void diminuirVolume() {
        if (ligada == true) {
            if (volume > 0) {
                volume--;
                System.out.println("\nVolume diminuído!");
                System.out.println("Volume: " + getVolume());
            } else {
                System.out.println("O volume está no mínimo.");
            }
        } else {
            System.out.println("\nA TV está desligada!");
        }
    }

    public void exibirCanal() {
        if (ligada == true) {
            System.out.println("\nCanal: " + getCanal());
        } else {
            System.out.println("\nA TV está desligada!");
        }
    }

    public void exibirVolume() {
        if (ligada == true) {
            System.out.println("\nVolume: " + getVolume());
        } else {
            System.out.println("\nA TV está desligada!");
        }
    }

    public void verificarTV() {
        if (ligada == true) {
            System.out.println("\nA TV está ligada.");
        } else {
            System.out.println("\nA TV está desligada.");
        }
    }

    /**
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        if (ligada == true) {
            if (canal >= 0 && canal <= 99) {
                this.canal = canal;
                System.out.println("Canal alterado! (" + canal + ")");
            } else {
                System.out.println("\nEste canal não existe!");
            }
        } else {
            System.out.println("A TV está desligada!");
        }
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
