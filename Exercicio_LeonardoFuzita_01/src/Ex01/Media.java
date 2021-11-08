
package Ex01;

import javax.swing.JOptionPane;
public class Media {
    private float mediaFinal;
    
    public void calculo (float n1, float n2, float n3, int p1, int p2, int p3){
        int peso = p1 + p2 + p3;
        
        this.mediaFinal = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / peso;
        JOptionPane.showMessageDialog(null, "A média ponderada das notas é: " + this.mediaFinal);
    }
    
}
