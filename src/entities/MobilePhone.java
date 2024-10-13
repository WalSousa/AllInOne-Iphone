package entities;

import interfaces.Phone;

public class MobilePhone implements Phone {

    @Override
    public void call() {
        System.out.println("\nLigando celular tijolão..... Ligado");
    }

    @Override
    public void answer() {
        System.out.println("\nLigação recebida no celular tijolão, atender.");
    }

    @Override
    public void voiceMail() {
        System.out.println("\nVocê tem mensagens na caixa postal no celular. Iniciar correio de voz.");
    }
}
