
package Ex03;

import javax.swing.JOptionPane;

public class SalarioComissao {
    public static void main(String[] args){
        Salario salarioFinal = new Salario();
        
        float salario, vendas; 
        
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do salário recebido: "));
        vendas = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor das vendas realizadas no mês: "));
        
        salarioFinal.calcularSalario(salario, vendas);
    }
    
}
