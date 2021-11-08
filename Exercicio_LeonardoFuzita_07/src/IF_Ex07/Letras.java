
package IF_Ex07;

public class Letras {
    private String letras;
    private int a, e, i, o, u, cons;
    
    public void verificar(String letra){
        if(letra.equalsIgnoreCase("a")){
            this.a++;
        }
        else if(letra.equalsIgnoreCase("e")){
            this.e++;
        }
        else if(letra.equalsIgnoreCase("i")){
            this.i++;
        }
        else if(letra.equalsIgnoreCase("o")){
            this.o++;
        }
        else if(letra.equalsIgnoreCase("u")){
            this.u++;
        }else{
            if(!letra.equalsIgnoreCase("0")){
            this.cons++;  
            }
        }
    }  
    
    public String mostrar(){
        this.letras = "A quantidade de A: " + this.a + "\nA quantidade de E: " + this.e + "\nA quantidade de I: " + this.i 
                + "\nA quantidade de O: " + this.o + "\nA quantidade de U: " + this.u + "\nConsoantes: " + this.cons;
        return this.letras;
    }
} 

