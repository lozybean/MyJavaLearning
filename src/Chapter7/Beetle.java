package Chapter7;
import static org.lozybean.util.Print.*;
class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s){
		println(s);
		return 47;
	}
}
public class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	public Beetle(){
		println("k = " + k);
		println("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x2 initialized");
	public static void main(String[] args){
		println("Beetle constructor");
		Beetle b = new Beetle();
	}
}
