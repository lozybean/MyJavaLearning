package Chapter11;
import java.util.*;
import static org.lozybean.util.Print.*;

public class TestList {
	static List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4));
	public static void main(String[] args){
		println(a.getClass());
		println(a.indexOf(2));
		
	}
}
