import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*

A barraca de lanches do seu Chico precisa da sua ajuda!
Seu Chico precisa colocar no sistema os itens que ele vende em sua barraca,
eles são separados em: lanches, bebidas, porções e pratos executivos
(insira pelo menos 3 itens de cada).
Faça um programa que selecione qual o tipo de item ele irá inserir
(usando o switch case para saber se é um lanche, bebida..) e ao final mostre os itens
(com foreach) separados por seção.

Nesse exercício vocês irão precisar de um laço de repetição,
e criar para cada tipo de seção um array (um array para bebidas,
um array pra porções...) e no final fazer a impressão desses itens
cadastrados separados por seção.


 */


public class Main {
    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tCadastrar novo Lanche\n" +
                        "2\t\t=>\t\tCadastrar nova Bebida\n" +
                        "3\t\t=>\t\tCadastrar nova Porção\n" +
                        "4\t\t=>\t\tCadastrar novo Prato Executivo\n" +
                        "5\t\t=>\t\tMostrar todas os Lanches\n" +
                        "6\t\t=>\t\tMostrar todas as Bebidas\n" +
                        "7\t\t=>\t\tMostrar todos as Porções\n" +
                        "8\t\t=>\t\tMostrar todos os Pratos Executivos\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 8) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 12/5/2022 - Exercício 7 Orientação a Objetos - Curso: Desenvolvedor Java Vespertino\n\n");

        List<Lanche> lanches = new ArrayList<>();
        List<Bebida> bebidas = new ArrayList<>();
        List<Porcao> porcoes = new ArrayList<>();
        List<Executivo> pratos_executivos = new ArrayList<>();

        String nome;
        Double preco;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.print("\n\nNome do Lanche: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPreço do novo Lanche: ");
                    preco = new Scanner(System.in).nextDouble();

                    lanches.add(new Lanche(nome,preco));
                    System.out.println("\n\nLANCHE CADASTRADA COM SUCESSO!\n\n");
                    continue;

                case 2:
                    System.out.print("\n\nNome da Bebida: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPreço da nova Bebida: ");
                    preco = new Scanner(System.in).nextDouble();

                    bebidas.add(new Bebida(nome,preco));
                    System.out.println("\n\nBEBIDA CADASTRADA COM SUCESSO!\n\n");
                    continue;

                case 3:
                    System.out.print("\n\nNome da Porção: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPreço da nova Porção: ");
                    preco = new Scanner(System.in).nextDouble();

                    porcoes.add(new Porcao(nome,preco));
                    System.out.println("\n\nPORÇÃO CADASTRADA COM SUCESSO!\n\n");
                    continue;

                case 4:

                    System.out.print("\n\nNome do Prato Executivo: ");
                    nome = new Scanner(System.in).nextLine();
                    System.out.print("\n\nPreço do novo Prato Executivo: ");
                    preco = new Scanner(System.in).nextDouble();

                    pratos_executivos.add(new Executivo(nome,preco));
                    System.out.println("\n\nPRATO EXECUTIVO CADASTRADA COM SUCESSO!\n\n");
                    continue;


                case 5:
                    if(!lanches.isEmpty()){
                        for(Lanche l : lanches){
                            System.out.println("\n=====");
                            System.out.println("Nome = "+l.getNome());
                            System.out.println("Preço = "+l.getPreco());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UM LANCHE ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 6:
                    if(!bebidas.isEmpty()){
                        for(Bebida b :bebidas){
                            System.out.println("\n=====");
                            System.out.println("Nome = "+b.getNome());
                            System.out.println("Preço = "+b.getPreco());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UMA BEBIDA ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 7:

                    if(!porcoes.isEmpty()){
                        for(Porcao p :porcoes){
                            System.out.println("\n=====");
                            System.out.println("Nome = "+p.getNome());
                            System.out.println("Preço = "+p.getPreco());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UMA PORÇÃO ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 8:
                    if(!pratos_executivos.isEmpty()){
                        for(Executivo pe : pratos_executivos){
                            System.out.println("\n=====");
                            System.out.println("Nome = "+pe.getNome());
                            System.out.println("Preço = "+pe.getPreco());
                            System.out.println("=====\n");
                        }
                    }else{
                        System.out.println("\n\nCADASTRE UM PRATO EXECUTIVO ANTES DE RODAR ESSA OPÇÃO!\n\n");
                    }

                    continue;

                case 0:
                    run = false;
                    break;
            }

        }
    }
}