import java.util.Scanner;

public class Game {
    
    Scanner scanner = new Scanner(System.in);

    public static int turn;
    public static boolean gameEnd;

    public static Board boardGame = new Board();
    public static Player player1 = new Player(-1, -1, "player 1", 'O');
    public static Player player2 = new Player(-1, -1, "player 2", 'X');

    public static int winIndex[][] = {
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8},

        {0, 3, 6},
        {1, 4, 7},
        {2, 5, 8},

        {0, 4, 8},
        {2, 4, 6}
    };

    public Game(){
        turn = 0;
        gameEnd = false;
    }

    public void startGame(){

        System.out.println("WELCOME TO TIC TAC TOE");
        boardGame.displayBoard();

        while(!gameEnd){
            play();
        }

    }

    public Player getCurrentPlayer(){
        return (turn % 2 == 0)? player1 : player2;
    }

    public static boolean inputValidation(int inputX, int inputY){
        if(inputX < 0 || inputX > 2 || inputY < 0 || inputY > 2) return false;
        else return true;
    }

    public boolean winCheck(Player player){

        boolean win = false;

        for(int i=0 ; i<winIndex.length ; i++){
            boolean valid = true;
            for(int j=0 ; j<winIndex[i].length ; j++){
                if(boardGame.board[winIndex[i][j]] != player.symbol){
                    valid = false;
                    break;
                }
            }

            if(valid == true){
                win = true;
                break;
            }
        }

        return win;
    }

    public boolean isTie(){

        boolean Tie = true;
        for(int i=0 ; i<boardGame.board.length ; i++){
            if(boardGame.board[i] == '_'){
                Tie = false;
                break;
            }
        }

        return Tie;
    }

    public void play(){

        int x, y;
        
        Player player = getCurrentPlayer();

        do{

            System.out.print(player.name + " turn: ");
            x = scanner.nextInt();
            y = scanner.nextInt();

            player.inputX = x;
            player.inputY = y;
            
        }while(!(inputValidation(x, y) && boardGame.validation(x, y)));
        
        // System.out.println("MAKE MOVED");
        boardGame.fillBoard(x, y, player);
        boardGame.displayBoard();

        boolean winStatus = winCheck(player);

        if(winStatus == true){
            gameEnd = true;
            System.out.println(player.name + " wins!");
        }else if(isTie()){
            gameEnd = true;
            System.out.println("TIE!");
        }

        if(turn == 0) turn = 1;
        else turn = 0;

    }


}
