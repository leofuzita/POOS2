
package IF_Ex07;

import javax.swing.JOptionPane;
public class PrincipalLetras {
    public static void main (String[] args){
        
        Letras letras = new Letras();
        String letra = "1";
        
        while(!letra.equalsIgnoreCase("0")){
            letra = JOptionPane.showInputDialog("Informe a letra:");
            letras.verificar(letra);
        } 
        JOptionPane.showMessageDialog(null, letras.mostrar());
    }
}
