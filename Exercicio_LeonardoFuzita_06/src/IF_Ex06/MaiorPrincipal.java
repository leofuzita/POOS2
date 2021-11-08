
package IF_Ex06;

import javax.swing.JOptionPane;
public class MaiorPrincipal {
    public static void main (String[] args){
        Maior maior = new Maior();
        for(int i = 1; i <= 10; i++){
            maior.retornarResult(Integer.parseInt(JOptionPane.showInputDialog("Informe um número: ")));
        }
        JOptionPane.showMessageDialog(null, maior.retornarMaior());
        JOptionPane.showMessageDialog(null, maior.retornarMenor());
    }  
}
