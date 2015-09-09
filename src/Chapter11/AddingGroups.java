package Chapter11;
import static org.lozybean.util.Print.*;
import java.util.*;
public class AddingGroups {
	private static Collection<Integer> collection;

	public static void main(String[] args){
		collection =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		println(collection);
	}
}
