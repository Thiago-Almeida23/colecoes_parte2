package br.com.tarefa_m11;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListasPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        String nome;
        String sexo;

        while (true) {
            System.out.println("Digite o nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo (M/F): ");
            sexo = scanner.nextLine();

            if (sexo.equalsIgnoreCase("M")) {
                masculino.add(nome);
            } else if (sexo.equalsIgnoreCase("F")) {
                feminino.add(nome);
            } else {
                System.out.println("Sexo inválido, tente novamente.");
            }
        }

        System.out.println("\nLista de nomes masculinos: " + masculino);
        System.out.println("Lista de nomes femininos: " + feminino);
    }
}
