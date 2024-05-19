public class Main {
    public static void main(String[] args) {
        // Criando instâncias das interfaces
        ReprodutorMusical reprodutorMusical = new ReprodutorMusicalImpl();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonicoImpl();
        NavegadorInternet navegadorInternet = new NavegadorInternetImpl();

        // Criando uma instância do iPhone
        iPhone iphone = new iPhone(reprodutorMusical, aparelhoTelefonico, navegadorInternet);

        // Utilizando os métodos do iPhone
        iphone.getReprodutorMusical().tocar();
        iphone.getAparelhoTelefonico().ligar("123456789");
        iphone.getNavegadorInternet().exibirPagina("www.google.com");
    }
}