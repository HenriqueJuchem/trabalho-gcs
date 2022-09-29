package Codigo1159;

import java.util.Scanner;

public class codigo{
    public static void main (String[] args){
        
        Scanner in = new Scanner(System.in);
        
        while(true){
            
                int x;
                int soma = 0;
                int guardaX;
                int numeroVezes = 0;
        
                System.out.println("Escreva o numero desejado para x: ");
                x = in.nextInt();
        
              
                 while(numeroVezes < 5)
                {
                    if(x % 2 == 0)
                    {
                        soma += x;
                        numeroVezes += 1;
                    }
                    x++;
                    
                }  
                
                
                System.out.println("Soma dos 5 números consecutivos de x: " + soma);
                
        
            }
    }
}