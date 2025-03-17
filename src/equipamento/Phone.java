package src.equipamento;

/* Aparelho Telefônico:
 * - ligar --> qual número
 * - atender
 * - iniciarCorreioVoz
 */
public interface Phone {
    public void ligar(int number);
    public void atender();
    public void iniciarCorreioVoz();
    
}
