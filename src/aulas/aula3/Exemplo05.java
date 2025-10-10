package aulas.aula3;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exemplo05 {
        public static void main(String[] args) {
            //came1Case
        String nomeAluno;
        double nota1 = 0, nota2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nomeAluno = input.nextLine();

        System.out.println("Digite nota 1: ");
        nota1 = input.nextDouble();

        System.out.println("Digite nota 2: ");
        nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 6) {
            System.out.println("Aprovado!");
            if ( media== 10) {
                System.out.println("Parabéns " + nomeAluno);
            }
        }else {
            System.out.println("Reprovado!");
        }
}
}