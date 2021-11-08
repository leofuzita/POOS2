
package IF_Ex06;

public class Maior {
    private int num, maior = 0, menor = 9999;
    
    public void retornarResult(int num){
        this.num = num;
        this.maior = maior;
        this.menor = menor;
        
        for(int i = 1; i <= 10; i++){
            if(num > maior){
                this.maior = num;
            }
            if(num < menor){
            this.menor = num;
            }
        }
    }
    public int retornarMaior(){
        return this.maior;
    }
    public int retornarMenor(){
        return this.menor;
    }
}
