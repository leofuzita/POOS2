
package Ex02;
import javax.swing.JOptionPane;

public class Salario {
    private double salarioFinal;
    
    public void calcularSalario (double valor, double porcentagem){
        this.salarioFinal = valor + (valor*porcentagem/100);
        JOptionPane.showMessageDialog(null, "O salário final do indivíduo é: " + this.salarioFinal);
    }
    
}
