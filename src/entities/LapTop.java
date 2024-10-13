package entities;

import interfaces.WebBrowser;

public class LapTop implements WebBrowser {

    @Override
    public void showPage() {
        System.out.println("\nClicando com mouse no ícone..., exibir página no computador");
    }

    @Override
    public void addNewPage() {
        System.out.println("\nAdicionar nova aba no web browser do computador");
    }

    @Override
    public void updatePage() {
        System.out.println("\natualizar página, clique no f5 do computador");
    }
}
