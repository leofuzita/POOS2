
package IF_Ex05;

import javax.swing.JOptionPane;
public class Inteiros {
    private int somaFinal, numero;
    
    public void somarNumero(int numero){
        
        this.numero = numero;
        this.somaFinal += this.numero;   
    }
    public int soma(){
        return somaFinal;
    }
}
