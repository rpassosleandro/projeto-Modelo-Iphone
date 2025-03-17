package src.usuario;

import src.equipamento.IphoneDevice;
import src.equipamento.Music;
import src.equipamento.Phone;
import src.equipamento.Web;

public class Usuario {
    public static void main(String[] args) {
        
        System.out.println(" ");
        System.out.println("========");
        System.out.println(" ");
        //////////////////
        //      WEB     //
        //////////////////
        Web pagina1 = new IphoneDevice();
        
        pagina1.adicionarNovaAba();
        pagina1.atualizarPagina();
        pagina1.exibirPagina("www.dio.me");

        System.out.println(" ");
        System.out.println("========");
        System.out.println(" ");

        ////////////////////
        //      PHONE     //
        ////////////////////
        Phone numero1 = new IphoneDevice();

        numero1.atender();
        numero1.ligar(990858282);
        numero1.iniciarCorreioVoz();

        System.out.println(" ");
        System.out.println("========");
        System.out.println(" ");

        ////////////////////
        //      MUSIC     //
        ////////////////////
        Music toca1 = new IphoneDevice();
        String musica[] = {"Musica_1","Musica_2","Musica_3","Musica_4","Musica_5"};

        toca1.tocar(musica[3]);
        toca1.selecionarMusica();
        toca1.pausar();

        System.out.println(" ");
        System.out.println("========");
        System.out.println(" ");
    }
}
