package entities;

import interfaces.Mp3Player;
import interfaces.Phone;
import interfaces.WebBrowser;

public class SmartPhone implements Mp3Player, Phone, WebBrowser {
    @Override
    public void playMusic() {
        System.out.println("\nTocando música pelo Iphone");
    }

    @Override
    public void pause() {
        System.out.println("\nMúsica pausada no Iphone");
    }

    @Override
    public void selectMusic() {
        System.out.println("\nPróxima música selecionada no Iphone");
    }

    @Override
    public void call() {
        System.out.println("\nLigando Iphone..... Ligado");
    }

    @Override
    public void answer() {
        System.out.println("\nLigação recebida, atender.");
    }

    @Override
    public void voiceMail() {
        System.out.println("\nVocê tem mensagens na caixa postal. Iniciar correio de voz.");
    }

    @Override
    public void showPage() {
        System.out.println("\nClicando no ícone na tela..., exibir página");
    }

    @Override
    public void addNewPage() {
        System.out.println("\nAdicionar nova aba no web browser no iphone");
    }

    @Override
    public void updatePage() {
        System.out.println("\natualizar página no iphone");
    }
}
