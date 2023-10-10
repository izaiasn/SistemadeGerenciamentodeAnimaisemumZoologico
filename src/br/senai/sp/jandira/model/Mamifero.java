package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mamifero extends  Animais{
    Scanner scanner = new Scanner(System.in);

    String corDoPelo, especieDeMamifero;
    List<Mamifero> listMamifero = new ArrayList<>();

    public void cadastraMamifero(){
        System.out.println("---------Cadastro de Animal mamifero---------");
        System.out.println("informe o nome do animal                     ");
        super.setNome(scanner.nextLine());
        System.out.println("informe o sexo do animal                     ");
        super.setSexo(scanner.nextLine());
        System.out.println("informe o idade do animal                    ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("informe o ID do animal                       ");
        super.setId(scanner.nextLong());
        System.out.println("informe a cor do pelo                         ");
        corDoPelo = scanner.next();
        System.out.println("informe a Especie do Mamifero                 ");
        especieDeMamifero = scanner.next();
        System.out.println("\"------Cadastro de Animal finalizado------\"");


    }
    public void adicionaMamifero(Mamifero objMamifero) {listMamifero.add(objMamifero); }

    public void listarMamifero(){

    }




}
