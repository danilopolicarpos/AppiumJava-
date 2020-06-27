package aula.stepsdefinitions;

        import aula.screen.FirstScreen;
        import cucumber.api.java.pt.*;


public class FirstSteps {
    FirstScreen lista;

    public FirstSteps() {
        lista = new FirstScreen();
    }

    @Dado("^que estou na lista de filmes$")
    public void queEstouNaListaDeFilmes() throws Throwable {
        this.lista.home();

    }

    @Quando("^realizar uma busca por titulo$")
    public void realizarUmaBuscaPorTitulo() throws Throwable {
        this.lista.digite_nome();

    }

    @Então("^vejo o resultado da busca$")
    public void vejoOResultadoDaBusca() throws Throwable {
        this.lista.btn_search();

    }

}
