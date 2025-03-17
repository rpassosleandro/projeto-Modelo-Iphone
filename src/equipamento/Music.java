package src.equipamento;

/* Reprodutor Musical
 * - tocar
 * - pausar
 * - selecionarMusica --> lista de musica
 */
public interface Music {

    String musica[] = {"Musica_1","Musica_2","Musica_3","Musica_4","Musica_5"};
    public void tocar();
    public void pausar();
    public void selecionarMusica(String music);
}
