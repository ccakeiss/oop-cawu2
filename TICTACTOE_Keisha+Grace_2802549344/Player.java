public class Player {
    
    public char symbol;
    public String name;
    public int inputX;
    public int inputY;

    
    public Player(int inputX, int inputY, String name, char symbol){
        this.inputX = inputX;
        this.inputY = inputY;
        this.name = name;
        this.symbol = symbol;
    }

}
