package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Ave extends  Animais{

    public String corDaPlumagem, especieDeAve;

    Scanner scanner = new Scanner(System.in);
    public void cadastroAve(){
        System.out.println("------------Cadastro de Animal Ave-----------");
        System.out.println("informe o nome da ave                        ");
        super.setNome(scanner.nextLine());
        System.out.println("informe o sexo da ave                        ");
        super.setSexo(scanner.nextLine());
        System.out.println("informe o idade da ave                       ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("informe o ID da ave                          ");
        super.setId(scanner.nextLong());
        System.out.println("informe a cor da Plumage                     ");
        corDaPlumagem= scanner.next();
        System.out.println("informe a cor da ave                         ");
        especieDeAve = scanner.next();
        System.out.println("\"--------Cadastro da Ave finalizado--------\"");
    }
}
