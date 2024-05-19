
class iPhone {

    ReprodutorMusical reprodutorMusical;
    AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    // Construtor
    public iPhone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico,
            NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    // Métodos para acessar os componentes do iPhone
    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    // Métodos adicionais para o iPhone
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
        aparelhoTelefonico.ligar(numero);
    }

    public void navegarNaWeb(String url) {
        System.out.println("Navegando para " + url);
        navegadorInternet.exibirPagina(url);
    }

    public void tocarMusica(String musica) {
        System.out.println("Tocando música " + musica);
        reprodutorMusical.selecionarMusica(musica);
        reprodutorMusical.tocar();
    }

    // ... outros métodos ...
    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public void setAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }
}
