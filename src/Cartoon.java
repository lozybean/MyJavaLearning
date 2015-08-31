import static org.lozybean.util.Print.*;

class Art {
	Art(){
		println("Art Constructor()");
	}
}
class Drawing extends Art{
	Drawing(){
		println("Draw Constructor()");
	}
}

public class Cartoon extends Drawing {
	public Cartoon(){
		println("Cartoon constructor()");
	}
	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}
