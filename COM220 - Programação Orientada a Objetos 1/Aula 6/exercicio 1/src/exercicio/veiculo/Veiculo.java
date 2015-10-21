package exercicio.veiculo;

/**
 *
 * @author architect
 */
public class Veiculo
{
    protected String marca = "";
    protected String cor = "";
    protected Boolean motorLigado;
    
    /**
     * @param pMarca parametro marca do veículo
     * @param pCor parametro Cor do veículo
     * @param pMotorLigado parametro que recebe o estado inicial do motor
    */
    public Veiculo(String pMarca, String pCor, Boolean pMotorLigado)
    {
        marca = pMarca;
        cor = pCor;
        motorLigado = pMotorLigado;
    }
    
    public void ligaMotor()
    {
        if(motorLigado)
            System.out.println("O motor já está ligado!");
        else
        {
            System.out.println("O motor acaba de ser ligado!");
            motorLigado = true;
        }
    }
    
    public void desligaMotor()
    {
        if(!motorLigado)
            System.out.println("O motor já está desligado!");
        else
        {
            System.out.println("O motor acaba de ser desligado!");
            motorLigado = false;
        }
    }
    
    public void mostrarAtributos()
    {
        System.out.println("Este é um veículo de marca "+marca+"de cor "+cor+".");
        if(motorLigado)
            System.out.println("Seu motor está ligado.");
        else
            System.out.println("Seu motor está desligado.");
    }
}
