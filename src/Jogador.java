import java.util.Scanner;
import java.util.*;
public class Jogador {

    public static int jogadores = 1;
    private int linha;
    private int coluna;
    private int input;

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha - 1;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna - 1;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }
    public void getJogadorInput(){
        Scanner input = new Scanner(System.in);


        if(jogadores == 1){
            System.out.println("Jogador " + jogadores +"(X)");
            setInput(1);
        } else if (jogadores == 2) {
            System.out.println("Jogador " + jogadores +"(O)");
            setInput(0);
        }
      try{
          System.out.print("Digite a linha:");
        setLinha(input.nextInt());
        System.out.println("Digite a coluna:");
        setColuna(input.nextInt());
        
      }catch(InputMismatchException e){
        setLinha(-1);
        setColuna(-1);
      }
 }

}
