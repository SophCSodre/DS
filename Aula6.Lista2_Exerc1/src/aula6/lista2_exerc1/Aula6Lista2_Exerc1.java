
package aula6.lista2_exerc1;

import java.util.Scanner;

public class Aula6Lista2_Exerc1 {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double perm = 0.0;
        System.out.println("Digite a velocidade permitida:");
        perm = grava.nextDouble();
        
        double mom = 0.0;
        System.out.println("Digite a velocidade no momento:");
        mom = grava.nextDouble();
        
        double media = mom - perm;
        
        if (media <= 0){
            System.out.println("Não há multa");
        } else if (media <= 10){
            System.out.println("Sua multa é de R$80,00");
        } else if (media <= 39){
            System.out.println("Sua multa é de R$120,00");
        } else {
            System.out.println("Sua multa é de R$200,00");
        }
    }
    
}
