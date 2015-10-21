package exercicio.veiculo.motocicleta;
import exercicio.veiculo.Veiculo;

/**
 *
 * @author architect
 */
public class Motocicleta extends Veiculo
{
    protected String estilo;
    
    /**
     * @param pMarca parametro marca do veículo
     * @param pCor parametro Cor do veículo
     * @param pMotorLigado parametro que recebe o estado inicial do motor
     * @param pEstilo parametro que recebe o estilo da motocicleta
    */
    public Motocicleta(String pMarca, String pCor, Boolean pMotorLigado, String pEstilo)
    {
        super(pMarca, pCor, pMotorLigado);
        estilo = pEstilo;
    }
    
    @Override
    public void mostrarAtributos()
    {
        System.out.println("Este é um veículo de marca "+marca+" seu estilo é "+estilo+" de cor "+cor+".");
        if(motorLigado)
            System.out.println("Seu motor está ligado.");
        else
            System.out.println("Seu motor está desligado.");
    }
}
