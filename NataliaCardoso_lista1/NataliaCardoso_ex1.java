/*
    - Descrição: Exercício 1- 17/04
    - Autor: Natalia 
    - Data: 03/05/23
*/

//inicializando codigo
import java.util.Scanner;
public class ex1 {
    public static void main(String args[]){
        
//passando valor às variaveis
        double n1,n2,n3,n4,res;
        n1=0.0;
        n2=0.0;
        n3=0.0;
        n4=0.0;
        res=0.0;

        
        Scanner input = new Scanner(System.in);
       System.out.println ("Digite um valor: ");
        n1=input.nextDouble();

         System.out.println ("Digite o segundo valor: ");
         n2=input.nextDouble();

         System.out.println ("Digite o terceiro valor: ");
         n3=input.nextDouble();

         System.out.println ("Digite o quarto valor: ");
         n4=input.nextDouble();

         res = n1+n2+n3+n4;
      //logica para sair o resultado
        System.out.printf("O resultado é:", res);
        input.close();
    }
}