
package Ex01;

import javax.swing.JOptionPane;
public class MediaPrincipal {
    public static void main(String[] args){
        Media mediaFinal = new Media();
        
        float n1, n2, n3;
        int p1, p2, p3;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
        p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da primeira nota: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
        p2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da segunda nota: "));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a terceira nota: "));
        p3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da terceira nota: "));
        
        mediaFinal.calculo(n1, n2, n3, p1, p2, p3);
    } 
    
}
