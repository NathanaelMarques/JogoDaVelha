public class Tabuleiro {

   private int[][] tabuleiro = new int[3][3]; // tabuleiro
   protected int contaResto = 0; //Descobrir quantos espaços ainda podem ser preenchidos

public void preparaTab(){
    for (int linha = 0; linha< tabuleiro.length; linha++){
        for (int coluna = 0; coluna< tabuleiro.length; coluna++){
            tabuleiro[linha][coluna] = -1;
            contaResto++;
        }
    }
}


    public void recebeVal(int linha,int coluna,int valor){

        if(tabuleiro[linha][coluna]!= -1){
            System.out.println("Espaço ocupado");
        }else{
            tabuleiro[linha][coluna] = valor;
            contaResto--;
            if(Jogador.jogadores == 1&&vitoria()==false){
                Jogador.jogadores = 2;
            }else if(Jogador.jogadores == 2&&vitoria()==false){
                Jogador.jogadores = 1;
            }
        }


    }


public void mostraTabuleiro(){

    for (int linha = 0; linha< tabuleiro.length; linha++){
        for (int coluna = 0; coluna< tabuleiro[linha].length; coluna++){
            if(tabuleiro[linha][coluna] == 0){
                System.out.print("|"+ "O" + "|");
            }else if(tabuleiro[linha][coluna] == 1) {
                System.out.print("|"+ "X" + "|");
            }else{
                System.out.print("|"+ " " + "|");
            }
        }
        System.out.println();
    }
    vitoria();
    empate();
}

public boolean vitoria(){

    for(int i =0;i<tabuleiro.length;i++){

       if((tabuleiro[i][0]==0&&tabuleiro[i][1]==0&&tabuleiro[i][2]==0)||(tabuleiro[i][0]==1&&tabuleiro[i][1]==1&tabuleiro[i][2]==1)){
           return true;
       }else if((tabuleiro[0][i]==0&&tabuleiro[1][i]==0&&tabuleiro[2][i]==0)||(tabuleiro[0][i]==1&&tabuleiro[1][i]==1&tabuleiro[2][i]==1)){
            return true;
        }else if((tabuleiro[0][0]==0&&tabuleiro[1][1]==0&&tabuleiro[2][2]==0)||(tabuleiro[0][0]==1&&tabuleiro[1][1]==1&&tabuleiro[2][2]==1)){
               return true;
        }else if((tabuleiro[0][2]==0&&tabuleiro[1][1]==0&&tabuleiro[2][0]==0)||(tabuleiro[0][2]==1&&tabuleiro[1][1]==1&&tabuleiro[2][0]==1)){
               return true;
        }
    }

 return false;
}
public boolean empate(){
    if(contaResto==0){
        return true;
    }
    return false;
}
}
