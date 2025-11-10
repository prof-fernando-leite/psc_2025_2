package br.com.unisul.psc.view;

import br.com.unisul.psc.dao.ProfessorDAO;
import br.com.unisul.psc.model.Professor;

import java.util.List;
import java.util.Scanner;

public class CommandLineView {
    private ProfessorDAO professorDAO;
    Scanner scanner;

    public CommandLineView() {
        this.professorDAO = new ProfessorDAO();
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("Menu principal");
        System.out.println("Digite 1 para adicionar um professor");
        System.out.println("Digite 2 para obter todos os professores");
        System.out.println("Digite 3 para atualizar o email do professor");
        System.out.println("Digite 4 para deletar um professor");
        System.out.println("Digite 5 para sair");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1: adicionarProfessor();
            break;
            case 2: listarTodos();
            default: System.out.println("Obrigado por usar nosso sistema");
        }
    }

    private  void adicionarProfessor() {
        System.out.println("Digite o nome do professor");
        String nome = scanner.next();
        System.out.println("Digite o email do professor");
        String email = scanner.next();
        professorDAO.insert(new Professor(1, nome, email));
        menu();
    }
    private void listarTodos() {
        List<Professor> professores = professorDAO.listarTodos();
        professores.forEach(professor -> System.out.println(professor));
        menu();
    }
}
