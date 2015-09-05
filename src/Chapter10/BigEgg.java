package Chapter10;
import static org.lozybean.util.Print.*;

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk(){
			println("Egg.Yolk()");
		}
	}
	public Egg(){
		println("New Egg()");
		y = new Yolk();
	}
}
public class BigEgg extends Egg {
	public class Yolk{
		public Yolk(){
			println("BigEgg.Yolk()");
		}
	}
	BigEgg(){
		println("New BigEgg()");
		new Yolk();
	}
	public static void main(String[] args){
		BigEgg bg = new BigEgg();
		bg.new Yolk();
	}/*output
New Egg()
Egg.Yolk()
New BigEgg()
BigEgg.Yolk()
BigEgg.Yolk()
*/
}

