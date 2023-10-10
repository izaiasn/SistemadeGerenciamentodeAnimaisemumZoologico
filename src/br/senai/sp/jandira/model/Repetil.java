package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Repetil extends Animais {


    public String corDaPlumagem, especieDeAve;

    Scanner scanner = new Scanner(System.in);

    public void cadastroRepetil() {
        System.out.println("-------------Cadastro de Repetil-------------");
        System.out.println("informe o nome do Répetil                    ");
        super.setNome(scanner.nextLine());
        System.out.println("informe o sexo do Répetil                    ");
        super.setSexo(scanner.nextLine());
        System.out.println("informe o idade do Répetil                   ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("informe o ID do Répetil                      ");
        super.setId(scanner.nextLong());
        System.out.println("informe a cor do Répetil                     ");
        corDaPlumagem = scanner.next();
        System.out.println("informe a especie do Répetil                 ");
        especieDeAve = scanner.next();
        System.out.println("\"-------Cadastro da Ave finalizado--------\"");
    }
}






