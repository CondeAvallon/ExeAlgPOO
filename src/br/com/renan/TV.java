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
        ligada = false;
        System.out.println("\n** TV desligada! **");
    }

    public void aumentarVolume() {
        if (isLigada()) {
            if (volume < 20) {
                volume++;
                System.out.println("\n** Volume aumentado! **");
                System.out.println("Volume: " + getVolume());
            } else {
                System.out.println("\n** O volume está no máximo!");
            }
        } else {
            System.out.println("\n** A TV está desligada! **");
        }
    }

    public void diminuirVolume() {
        if (isLigada()) {
            if (volume > 0) {
                volume--;
                System.out.println("\n** Volume diminuído! **");
                System.out.println("Volume: " + getVolume());
            } else {
                System.out.println("\n ** O volume está no mínimo! **");
            }
        } else {
            System.out.println("\n** A TV está desligada! **");
        }
    }

    public void exibirCanal() {
        if (isLigada()) {
            System.out.println("\n** Canal atual: " + getCanal() + " **");
        } else {
            System.out.println("\n** A TV está desligada! **");
        }
    }

    public void exibirVolume() {
        if (isLigada()) {
            System.out.println("\n** Volume: " + getVolume() + " **");
        } else {
            System.out.println("\n** A TV está desligada! **");
        }
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

    /**
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        if (isLigada()) {
            if (canal >= 0 && canal <= 99) {
                this.canal = canal;
                System.out.println("\n** Canal alterado! (" + canal + ") **");
            } else {
                System.out.println("\n** Este canal não existe! **");
            }
        } else {
            System.out.println("\n** A TV está desligada! **");
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
