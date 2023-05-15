/* DESCRIÇÃO: Perimetro do circulo
AUTOR: Natália Cardoso 
DATA: 07/05/2023
*/


import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        double raio,perim; 
        raio= perim=0.0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o valor do raio do círculo: ");
             raio = input.nextDouble();
        }

        perim = 2 * 3.14 * raio;
//calcula o perimetro do circulo
        System.out.printf("O perímetro do círculo é: ", perim);
    }
}