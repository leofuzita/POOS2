
package Ex02;
import javax.swing.JOptionPane;
public class Salario_Final {
    public static void main(String[] args){
        Salario salarioFinal = new Salario();
        
        double valor, porcentagem;
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor atua do salário: "));
        porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem de aumento: "));
        
        salarioFinal.calcularSalario(valor, porcentagem);
    }
    
}
