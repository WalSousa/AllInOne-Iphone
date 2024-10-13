package entities;

import interfaces.Mp3Player;

public class Ipod implements Mp3Player {
    @Override
    public void playMusic() {
        System.out.println("\nTocando música pelo Ipod");
    }

    @Override
    public void pause() {
        System.out.println("\nMúsica pausada no Ipod");
    }

    @Override
    public void selectMusic() {
        System.out.println("\nPróxima música selecionada no Ipod");
    }
}
