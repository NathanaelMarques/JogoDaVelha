
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindos ao JOGO DA VELHA");
        Scanner input = new Scanner(System.in); //inputs kkkk
        int jogadores = 1; //desenvolver lógica para jogadores
        int L;//linha
        int C;//coluna
        boolean game =  true;

        Tabuleiro tab = new Tabuleiro();
        tab.preparaTab();
        System.out.println("Vamos começar!");

        while(game){
            tab.mostraTab();
            System.out.println("Jogador " + jogadores +":");

            System.out.print("Digite a linha:");
            L=input.nextInt();
            System.out.println("Digite a coluna:");
            C= input.nextInt();
            System.out.println("Insira O ou X");

            try {

                tab.recebeVal(L - 1, C - 1, input.next()); //detecta se is valores estão corretos

            }catch(ArrayIndexOutOfBoundsException e){

                System.out.println("Valores inseridos inválidos!");

            }


            if(tab.vitoriaOuEmpate()){
                tab.mostraTab();
                System.out.println("Vitória do Jogador " + jogadores);
                game=false;
            }
        }


    }
}