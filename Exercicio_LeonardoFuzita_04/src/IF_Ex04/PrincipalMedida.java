
package IF_Ex04;

import javax.swing.JOptionPane;
public class PrincipalMedida {
    public static void main(String[] args){
        Medidas medidas = new Medidas();
        
        JOptionPane.showMessageDialog(null, "A situação da análise é: " +
                medidas.analisar(Float.parseFloat(JOptionPane.showInputDialog("Informe a pontuação de água presente nela: "))));
    }
}
