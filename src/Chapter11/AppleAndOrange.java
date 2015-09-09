package Chapter11;
import static org.lozybean.util.Print.*;
import java.util.*;
class Apple{
	private static long counter;
	private final long id = counter ++;
	public long id(){
		return id;
	}
}
class Orange extends Apple{
	
}
public class AppleAndOrange {
	//@SuppressWarnings("unchecked");
	public static void main(String[] args){
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for(int i=0; i<3; i++){
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for(Apple a:apples){
			println(a.id());
			println(a.getClass());
		}
	}
}
