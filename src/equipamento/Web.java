package src.equipamento;

/* Navegador Internet:
 * - exibirPagina --> passar url
 * - adicionarNovaAba
 * - atualizarPagina
 */
public interface Web {
    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();
    
}
