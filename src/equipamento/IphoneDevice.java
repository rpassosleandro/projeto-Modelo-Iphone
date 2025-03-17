package src.equipamento;

//Esta classe deve implements todas as outras que são interface (Music, Phone e Web)
public class IphoneDevice implements Music, Phone, Web{

    // Métodos WEB
    public void exibirPagina(String minhaPagina) {
        System.out.println("Exibindo página da web: " + minhaPagina);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página da web");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }

    // Métodos PHONE
    public void ligar(int meuNumero) {
        System.out.println("Ligando para o número: " + meuNumero);
    }

    public void atender() {
        System.out.println("Atendendo chamada telefônica");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    // Métodos MUSIC
    public void tocar(String minhaMusica) {
        System.out.println("Tocando música: " + minhaMusica );
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música ");
    }
   
}