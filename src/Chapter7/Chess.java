package Chapter7;
import static org.lozybean.util.Print.*;

class Game{
	Game(int i){
		println("Game constructor");
	}
}
class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		println("BoardGame constructor");
	}
}

public class Chess extends BoardGame{
	Chess(){
		super(11);
		println("Chess Constructer");
	}
	public static void main(String[] args){
		Chess x = new Chess();
	}
}
