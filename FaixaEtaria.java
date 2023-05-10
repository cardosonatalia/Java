/* DESCRIÇÃO: Definição da faixa etária
AUTOR: Natália Cardoso 
DATA: 07/05/2023
*/

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Insira sua idade: ");
            int idade = input.nextInt();

            String faixaEtaria;

            if (idade <= 12) {
                faixaEtaria = "Criança";
            } else if (idade <= 19) {
                faixaEtaria = "Adolescente";
            } else if (idade <= 65) {
                faixaEtaria = "Adulto";
            } else {
                faixaEtaria = "Idoso";
            }

            System.out.printf("Você está na faixa etária de: ", faixaEtaria);
        }
    }
}
