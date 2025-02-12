public class Board {
    
    public char board[] ={
        '_','_','_',
        '_','_','_',
        '_','_','_'
    };

    // Player player;

    public void displayBoard() {
        for(int i=0; i<this.board.length; i++) {
            System.out.print(this.board[i] + " ");
            if((i+1)%3==0) System.out.println();
        }
    }

    public void fillBoard(int x, int y, Player player){
        // System.out.println(player.name + " " + player.symbol);
        // System.out.println("CHECK");
        this.board[y*3 + x] = player.symbol;
    }

    public boolean validation(int x, int y){
        if(this.board[y*3 + x] != '_'){
            System.out.println("Position already filled!");
            return false;
        }

        else return true;
    }

}
