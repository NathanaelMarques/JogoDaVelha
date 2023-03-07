public class Tabuleiro {

   private int[][] tabuleiro = new int[3][3]; // visao do sistema
    private String[][] tabuleiroJogador = new String[3][3]; //visao do jogador

public void preparaTab(){
    for (int linha = 0; linha< tabuleiro.length; linha++){
        for (int coluna = 0; coluna< tabuleiro.length; coluna++){
            tabuleiro[linha][coluna] = -1;
        }
    }
}


    public void recebeVal(int linha,int coluna,String valorS){
    int valor=-1;
    if(valorS.equalsIgnoreCase("O")||valorS.equalsIgnoreCase("0")){
        valor=0;
    }else if(valorS.equalsIgnoreCase("X")||valorS.equalsIgnoreCase("1")){
        valor=1;
    }

    if(valor>1||valor<0){
            System.out.println("Valores inseridos inválidos!");
        }
        else if(tabuleiro[linha][coluna]!= -1){
            System.out.println("Espaço ocupado");
        }else{
            tabuleiro[linha][coluna] = valor;
        }


    }
public void controleTab(){

    for (int linha = 0; linha< tabuleiro.length; linha++){ //controle do tabuleiro
        for (int coluna = 0; coluna< tabuleiro.length; coluna++){

            if(tabuleiro[linha][coluna] == 0){
                tabuleiroJogador[linha][coluna] ="O";
            }else if(tabuleiro[linha][coluna] == 1) {
                tabuleiroJogador[linha][coluna] ="X";
            }else{
                tabuleiroJogador[linha][coluna]=" ";}
        }
    }
}

public void mostraTab(){

    controleTab();

    for (int linha = 0; linha< tabuleiro.length; linha++){ //mostrando a tabuleiro
        for (int coluna = 0; coluna< tabuleiro[linha].length; coluna++){
            System.out.print("|"+ tabuleiroJogador[linha][coluna]+"|");
        }
        System.out.println();
    }
    vitoriaOuEmpate();
}

public boolean vitoriaOuEmpate(){
   boolean vitoria = false;
   int vitO = 0; //contador O
   int vitX = 0;// contador X
   for(int i =0;i<tabuleiro.length;i++){
       for(int j =0;j<tabuleiro.length;j++){
           if(tabuleiro[i][j]==0){
               vitO++;
           } if (tabuleiro[i][j]==1) {
               vitX++;
           }
       }
       if(vitO <3){
           vitO =0;
       }
       if(vitX<3){
           vitX=0;
       }
   }
    for(int i =0;i<tabuleiro.length;i++){
        for(int j =0;j<tabuleiro.length;j++){
            if(tabuleiro[j][i]==0){
                vitO++;
            } if (tabuleiro[j][i]==1) {
                vitX++;
            }
        }
        if(vitO <3){
            vitO =0;
        }
        if(vitX<3){
            vitX=0;
        }
    }
   if(vitX==3){
       vitoria=true;
       return vitoria;
   }
   else if(vitO ==3){
       vitoria=true;
       return vitoria;
   } else if(tabuleiro[0][0]==1&&tabuleiro[1][1]==1&&tabuleiro[2][2]==1){
       vitoria=true;
       return vitoria;
   } else if (tabuleiro[0][2]==1&&tabuleiro[1][1]==1&&tabuleiro[2][0]==1) {
       vitoria=true;
       return vitoria;
   }else if(tabuleiro[0][0]==0&&tabuleiro[1][1]==0&&tabuleiro[2][2]==0){
        vitoria=true;
        return vitoria;
    } else if (tabuleiro[0][2]==0&&tabuleiro[1][1]==0&&tabuleiro[2][0]==0) {
       vitoria=true;
       return vitoria;
    }//HARD CODE kkkk

 return false;
}

}
