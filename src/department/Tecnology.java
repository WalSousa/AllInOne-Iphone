package department;

import entities.Ipod;
import entities.LapTop;
import entities.MobilePhone;
import entities.SmartPhone;
import interfaces.Mp3Player;
import interfaces.Phone;
import interfaces.WebBrowser;

public class Tecnology {

    public static void tecnology() {

        Mp3Player mp3Player = new Ipod();
        mp3Player.playMusic();
        mp3Player.pause();
        mp3Player.selectMusic();

        System.out.println("\n*****IPOD******");

        Phone telefone = new MobilePhone();
        telefone.call();
        telefone.answer();
        telefone.voiceMail();

        System.out.println("\n*****Celular******");

        WebBrowser webBrowser = new LapTop();
        webBrowser.showPage();
        webBrowser.addNewPage();
        webBrowser.updatePage();

        System.out.println("\n*****Computador******");

        System.out.println("\n*****Início IPHONE******");

        mp3Player = new SmartPhone();
        mp3Player.playMusic();
        mp3Player.pause();
        mp3Player.selectMusic();

        telefone = new SmartPhone();
        telefone.call();
        telefone.answer();
        telefone.voiceMail();

        webBrowser = new SmartPhone();
        webBrowser.showPage();
        webBrowser.addNewPage();
        webBrowser.updatePage();

        System.out.println("\n*****Fim IPHONE******");
    }
}
