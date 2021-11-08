
package IF_Ex04;

public class Medidas {
    private float media, medidafinal;
    private String resposta;
    
    public String analisar(float media){
        this.medidafinal = media;
        
        if(this.medidafinal <= 10){
            this.resposta = "Rochosa";
        }
        else{
            if((this.medidafinal > 10) && (this.medidafinal <= 40)){
                this.resposta = "Firme";
            }
            else{
                if((this.medidafinal > 40) && (this.medidafinal <= 80)){
                    this.resposta = "Pantanosa";
                }
                else{
                    this.resposta = "Quantidade de água inválida!";
                }
            }
        }
        return this.resposta;
    }
}
