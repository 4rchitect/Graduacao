package exercicio.veiculo.carro;
import exercicio.veiculo.Veiculo;

/**
 *
 * @author architect
 */

public class Carro extends Veiculo
{
    protected Boolean malasCheio;
    
    /**
     * @param pMarca parametro marca do veículo
     * @param pCor parametro Cor do veículo
     * @param pMotorLigado parametro que recebe o estado inicial do motor
     * @param pMalasCheio parametro que recebe o estado inicial do porta malas
    */
    public Carro(String pMarca, String pCor, Boolean pMotorLigado, Boolean pMalasCheio)
    {
        super(pMarca, pCor, pMotorLigado);
        malasCheio = pMalasCheio;
    }
    
    public void encheMala()
    {
        if(malasCheio)
            System.out.println("O porta malas já está cheio.");
        else
        {
            System.out.println("O porta malas acaba de ser cheio.");
            malasCheio = true;
        }
    }
    
    public void esvaziaMala()
    {
        if(!malasCheio)
            System.out.println("O porta malas já está vazia.");
        else
        {
            System.out.println("O porta malas acaba de ser esvaziado.");
            malasCheio = false;
        }
    }
    
    @Override
    public void mostrarAtributos()
    {
        System.out.println("Este é um veículo de marca "+marca+" de cor "+cor+".");
        if(motorLigado)
            System.out.println("Seu motor está ligado.");
        else
            System.out.println("Seu motor está desligado.");
        
        if(malasCheio)
            System.out.println("Sua mala está cheia.");
        else
            System.out.println("Sua mala está vazia.");
    }
}