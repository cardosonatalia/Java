/*
    - Descrição: Exercício 2- 17/04
    - Autor: Natalia 
    - Data: 03/05/23
*/
import java.util.Scanner;
public class ex3 {
    public static void main(String args[]){
        //valor das variaveis
        double valBra,valDol;
        valBra=0.0;
        valDol=0.0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.printf ("Digite o valor a ser convertido:R$ ");
             valBra=input.nextDouble();
        }
        System.out.printf("O valor convertido é de: ", valDol);
        
        
    }
}