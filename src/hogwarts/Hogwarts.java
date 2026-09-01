package hogwarts;

import java.util.Scanner;

/**
 *
 * @author abner
 */
public class Hogwarts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dê enter para começar o projeto: ");
        String controller = "";

        while (!"sair".equals(controller)) {
            controller = input.nextLine();
            System.out.println("Digite o nome do aluno (ou 'sair' para encerrar): ");
            String nome = input.nextLine();
            if ("sair".equals(nome)) {
                break;
            }

            System.out.println("Digite a idade do aluno: ");
            int idade = input.nextInt();

            System.out.println("Digite a coragem do aluno (0-100): ");
            int coragem = input.nextInt();

            System.out.println("Digite a inteligência do aluno (0-100): ");
            int inteligencia = input.nextInt();

            System.out.println("Digite a ambição do aluno (0-100): ");
            int ambicao = input.nextInt();

            System.out.println("Digite a lealdade do aluno (0-100): ");
            int lealdade = input.nextInt();

            System.out.println("Digite a estratégia do aluno (0-100): ");
            int estrategia = input.nextInt();

            System.out.println("Digite a criatividade do aluno (0-100): ");
            int criatividade = input.nextInt();

            Aluno aluno = new Aluno(nome, idade, coragem, inteligencia, ambicao, lealdade, estrategia, criatividade,
                    "Indefinida");
            aluno.calcularCasa();
            aluno.exibirInformacoes();
        }
    }

}
