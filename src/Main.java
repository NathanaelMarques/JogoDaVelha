public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindos ao JOGO DA VELHA");


        boolean game =  true;

        Tabuleiro tab = new Tabuleiro();
        Jogador player = new Jogador();
        tab.preparaTab();
        System.out.println("Vamos começar!");

        while(game){
            tab.mostraTabuleiro();
            player.getJogadorInput();

            try {

                tab.recebeVal(player.getLinha(), player.getColuna(), player.getInput()); //detecta se is valores estão corretos

            }catch(ArrayIndexOutOfBoundsException e){
                System.out.print("\033[H\033[2J");  
                System.out.flush(); 
                System.out.println("Valores inseridos inválidos!");
             
            }

          if(tab.vitoria()){
                tab.mostraTabuleiro();
                System.out.println("Vitória do Jogador " + Jogador.jogadores);
                game=false;
            }else if(tab.empate()){
              tab.mostraTabuleiro();
              System.out.println("EMPATE");
              game=false;
          }
        }


    }
}