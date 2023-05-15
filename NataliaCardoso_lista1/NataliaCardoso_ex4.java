/*
    - Descrição: Exercício 2- 17/04 
    - Autor: Natalia 
    - Data: 03/05/23
*/
import java.util.Scanner;
public class ex2 {
    public static void main(String args[]){
       //declarando valor das variaveis
        double n1,n2,n3,n4,res;
        n1=0.0;
        n2=0.0;
        n3=0.0;
        n4=0.0;
        res=0.0;
  
        Scanner input = new Scanner(System.in);
       System.out.print ("Digite um valor: ");
         n1= input.nextDouble();

         System.out.print ("Digite o segundo valor: ");
         n2= input.nextDouble();

         System.out.print ("Digite o terceiro valor: ");
         n3= input.nextDouble();

         System.out.print ("Digite o quarto valor: ");
         n4=input.nextDouble();

         res = (n1*n1)+(n2*n2)+(n3*n3)+(n4*n3);
      //resultado da conta é a soma dos numeros ao quadrado
        System.out.printf("O resultado é:", +res);
        input.close();
        
    }
}