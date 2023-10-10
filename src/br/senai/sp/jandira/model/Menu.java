package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    public void menu(){
        Mamifero refereciaMamifero = new Mamifero();
        Ave referenciaAve = new Ave();
        Repetil referenciaRepetil = new  Repetil();
        Scanner scanner = new Scanner(System.in);

        boolean continua = true;

        while (continua){
            System.out.println("\n-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("1 - Cadastrar Mamifero");
            System.out.println("2 - Ave");
            System.out.println("3 - Repetil");
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/");

            System.out.print("\nESCOLHA UMA DAS OPÇÕES DO MENU: ");
            int decisao = scanner.nextInt();
            scanner.nextLine();

            switch (decisao){
                case 1:
                    Mamifero mamifero = new Mamifero();
                    mamifero.cadastraMamifero();
                    break;

                case 2:
                    Ave ave = new Ave();
                    ave.cadastroAve();
                    break;

                case 3:
                    Repetil repetil = new Repetil();
                    repetil.cadastroRepetil();


            }

        }
    }


}
