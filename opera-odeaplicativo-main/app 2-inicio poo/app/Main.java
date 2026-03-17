package com.sgp.app;

import java.util.Scanner;

import com.sgp.modelo.moto;
impory com.sgp.util.Validacoes;

public class MainAcessoMenu {
    
    public static void main(String[] args) {
        scanner sc = new Scanner(System.in);
        Moto moto = new Moto("Menu",20);
        int opcao ;

        do{

          imprimeMenu();
          opcao = recebeOpcao(scanner);

          switch (opcao) {
            case1:
                System.out.println("menu.toString());");
                break;
            case 2:
                alterarmaca(moto, scanner);
                break;
            case 3:
                alterarmodelo(moto, scanner);
                break;
            case 4:
                moto.saudacao();
                break;
            case 5:
                alterarAno(moto, scanner);
                break;
                case 0:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
          }
        }while (opcao != 0);
        
        scanner.close();
    }
    
    public static void imprimeMenu() {
        System.out.println("\n ===Menu de Acesso===");
        System.out.println("1. Exibir informações da moto");
        System.out.println("2. Alterar marca");
        System.out.println("3. Alterar modelo");
        System.out.println("4. Exibir saudação");
        System.out.println("5. Alterar ano");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOpcao(Scanner scanner) {
        int opcao;
        triy {
            opcao = integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarmarca(Moto moto, Scanner scanner) {
        System.out.println("Digite a nova marca:");
        String novaMarca = scanner.nextLine();
        if (Validacoes.validarMarca(novaMarca)) {
            moto.setMarca(novaMarca);
            System.out.println("Marca alterada com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroMarca(novaMarca));
        
        }
    }

    public static void alterarmodelo(Moto moto, Scanner scanner) {
        System.out.println("Digite o novo modelo:");
        String novoModelo = scanner.nextLine();
        if (Validacoes.validarModelo(novoModelo)) {
            moto.setModelo(novoModelo);
            System.out.println("Modelo alterado com sucesso!");
        } else {
            System.out.println(Validacoes.mensagemErroModelo(novoModelo));
        
        }
    }
    public static void alterarAno(Moto moto, Scanner scanner) {
        System.out.println("Digite o novo ano:");
        int novoAno;
        try {
            novoAno = Integer.parseInt(scanner.nextLine());
            if (Validacoes.validarAno(novoAno)) {
                moto.setAno(novoAno);
                System.out.println("Ano alterado com sucesso!");
            } else {
                System.out.println(Validacoes.mensagemErroAno(novoAno));
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido para o ano!");
        }
    }
}

