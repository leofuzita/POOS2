
package Ex03;

import javax.swing.JOptionPane;

public class Salario {
    public float salarioFinal;
    public float comissaoFinal;
    
    public void calcularSalario (float salario, float vendas){
        this.comissaoFinal = (vendas * 4/100);
        this.salarioFinal = salario + (vendas * 4/100);
        
        JOptionPane.showMessageDialog(null, "O salário do indivíduo é R$: " + this.salarioFinal + " reais, e o valor da comissão é de R$: " + this.comissaoFinal + " reais." );
    }
    
}
