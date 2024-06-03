import java.util.Random;
import java.util.Scanner;

public class JogoTabuleiro {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Scanner lei = new Scanner(System.in);
        Random aleatorio = new Random();
        int somaTrovao = 0;
        int somaMare = 0;
        int opcao = 1, N1, N2;
        int vez = 1;
        int[] voltarUmaCasa = { 3, 4, 7, 12, 15, 19, 22, 25, 27, 28 };
        int[] avancarUmaCasa = { 2, 5, 6, 10, 13, 17, 20, 23, 26, 29 };

        System.out.println(
                "Bem vindo ao nosso tabuleiro, vamos entrar nesta aventura e ajudar nosso capitao barba bruta a encontrar o baú do tesouro!!");
        System.out.println(
                "Neste jogo, temos o pirata Trovao Salgado e o pirata Mare Violenta. Ganha quem conseguir guiar o capitao da melhor forma");

        while ((opcao != 0 && somaTrovao < 31 && somaMare < 31)) {
            System.out.println("***********************************");
            System.out.println("Digite a opção para selecionar sua função");
            System.out.println("1- VEZ DO PIRATA TROVAO SALGADO");
            System.out.println("2- VEZ DO PIRATA MARE VIOLENTA");
            System.out.println("3- DESISTIR DO JOGO");
            System.out.println("DIGITE A OPCAO:");
            opcao = leitura.nextInt();
            System.out.println("\n***********************************");
            switch (opcao) {
                case 1:

                    System.out.print("DiGITE '1' PARA LANÇAR O DADO \n");
                    N1 = leitura.nextInt();
                    if (N1 == 1) {
                        int dadoTrovao = aleatorio.nextInt(6) + 1;
                        System.out.println("Trovao Salgado tirou " + dadoTrovao + " no dado");
                        somaTrovao += dadoTrovao;
                        System.out.println("Trovao Salgado esta na posicao "+somaTrovao);
                        for (int i : voltarUmaCasa) {
                            if (somaTrovao == i) {
                                System.out.println("Esta posicao esta lotada de piratas inimigos");
                                somaTrovao -= 1; 
                                System.out.println("Dessa forma, foi necessario recuar, Trovao Salgado se encontra na posicao "+somaTrovao);
                            } else{System.out.println();}
                        }
                        for (int j : avancarUmaCasa) {
                            
                            else if (somaTrovao == j) {
                                System.out.println("Esta eh uma posiçao boa");
                                somaTrovao += 1; 
                                System.out.println("Dessa forma, Trovao Salgado encontrou um atalho e se encontra na posicao "+somaTrovao);
                            }else{System.out.println();}
                        }
                        if (somaTrovao >= 31) {
                            System.out.println(
                                    "O pirata Trovao Salgado guiou de forma melhor o capitão Barba Bruta e conseguiu achar o baú do tesouro");
                        }
                    }
                    break;
                case 2:

                    System.out.print("DiGITE '1' PARA LANÇAR O DADO \n");
                    N2 = leitura.nextInt();
                    if (N2 == 1) {
                        int dadoMare = aleatorio.nextInt(6) + 1;
                        System.out.println("Mare Violenta tirou " + dadoMare + " no dado");
                        somaMare += dadoMare;
                        System.out.println("Mare Violenta esta na posicao "+somaMare);
                        for (int i : voltarUmaCasa) { 
                            if (somaMare == i) {
                                System.out.println("Esta posicao esta lotada de piratas inimigos");
                                somaMare -= 1; 
                                System.out.println("Dessa forma, foi necessario recuar, Mare Violenta esta na posicao "+somaMare);
                            } else{System.out.println();}
                        }
                        for (int j : avancarUmaCasa) {  
                            else if (somaMare == j) {
                                System.out.println("Esta posiçao eh boa");
                                somaMare += 1; 
                                System.out.println("Dessa forma, Mare Violenta encontrou um atalho e se encontra na posicao "+somaMare);
                            } else{System.out.println();}
                        }  
                        if (somaMare >= 31) {
                            System.out.println(
                                    "O pirata Mare Violenta guiou de forma melhor o capitão Barba Bruta e conseguiu achar o baú do tesouro");
                        }   
                    }
                    break;

                default:
            }

        }

    }
}
