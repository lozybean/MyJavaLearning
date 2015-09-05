package Chapter10.staticinnerclasses;
import static org.lozybean.util.Print.*;

public interface ClassInInterface {
	void howdy();
	class Test implements ClassInInterface{
		public void howdy(){
			println("Howdy!");
		}
		public static void main(String[] args){
			new Test().howdy();
		}
	}
}
