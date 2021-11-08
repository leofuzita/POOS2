
package IF_Ex05;

import javax.swing.JOptionPane;
public class PrincipalInteiros {
    
    public static void main (String[] args){
        
        Inteiros inteiros = new Inteiros();
        for (int i = 1; i <= 10; i++){
            inteiros.somarNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número: ")));
        }
        JOptionPane.showMessageDialog(null,inteiros.soma());
    }
}
