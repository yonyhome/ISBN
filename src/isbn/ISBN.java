/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isbn;
/**
 *
 * @author consulta
 */
public class ISBN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int codigo,i=0,b,v[],cont=0;
        v =new int [11];
        codigo=(int ) (Math.random()*100000000);
        System.out.println("codigo "+codigo);
        b=codigo;
        
        
        while(b!=0 && i<=9){
            v[i]=b%10;
            System.out.println("v["+i+"] "+v[i]);
            b=b/10;
            System.out.println("b"+(b/10));
            i=i+1;
            System.out.println("error");
            if(i==8){
             v[i+1]= (int) (Math.random()*10);  
                
            }
        }   
        System.out.println("vector");
        for (int j = 0; j < 9; j++) {
            System.out.print(v[j]);
            System.out.print(",");
        
        }
        int suma=0;
        for (int j = 0; j < 9; j++) {
            suma = suma+(v[j]*(j+1));
        }
        if(suma%11==0){
            v[10]=0;
        }else{
            
            while(suma%11!=0){
                suma=suma+1;
                cont=1+cont;
            }
            if(i==1){
                
            }
        }
        
        
        
        
        
    }
    
}
