package src.equipamento;

/* Reprodutor Musical
 * - tocar
 * - pausar
 * - selecionarMusica --> lista de musica
 */
public interface Music {

    public void tocar(String music);
    public void pausar();
    public void selecionarMusica();
}
