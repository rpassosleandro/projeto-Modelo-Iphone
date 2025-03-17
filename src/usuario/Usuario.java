package src.usuario;

import src.equipamento.IphoneDevice;
import src.equipamento.Music;

public class Usuario {
    public static void main(String[] args) {
        Music toca1 = new IphoneDevice();
        String musica[] = {"Musica_1","Musica_2","Musica_3","Musica_4","Musica_5"};

        toca1.tocar();
        toca1.selecionarMusica(musica[3]);
        toca1.pausar();


    }
}
