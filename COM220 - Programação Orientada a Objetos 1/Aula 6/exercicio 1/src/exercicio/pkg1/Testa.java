/*
    A classe testa veículo deve instanciar um carro e uma moto. Deve
    se ligar a moto e mostrar seus atributos. Em seguida, deve
    se encher o porta malas do carro, ligá-lo e mostrar seus atributos
*/

package exercicio.pkg1;
import exercicio.veiculo.carro.*;
import exercicio.veiculo.motocicleta.*;

/**
 *
 * @author architect
 */
public class Testa
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Carro a = new Carro("Honda","preto",false,false);
        Motocicleta b = new Motocicleta("Suzuki","branca",false,"naked");
        
        b.ligaMotor();
        b.mostrarAtributos();
        a.encheMala();
        a.ligaMotor();
        a.mostrarAtributos();
    }
    
}
