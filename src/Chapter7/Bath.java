package Chapter7;
import static org.lozybean.util.Print.*;

class Soap{
	private String s;
	Soap(){
		println("Soap()");
		s = "Constructed";
	}
	public String toString(){
		return s;
	}
}

public class Bath {
	// Initializing at point of definition:
	private String s1="Happy",s2="Happy",s3,s4;
	private Soap castille;
	private int i ;
	private float toy;
	public Bath(){
		println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	// Instance initialization:
	{ 
		i = 47;
	}
	public String toString(){
		// Delayed initialization:
		if(s4==null){
			s4 = "Joy";
		}
		return
		"s1 = " + s1 + "\n" +
		"s2 = " + s2 + "\n" +
		"s3 = " + s3 + "\n" +
		"s4 = " + s4 + "\n" +
		"i = " + i + "\n" +
		"toy = " + toy + "\n" +
		"castille = " + castille;
	}
	public static void main(String[] args){
		Bath b = new Bath();
		print(b);
	}
}

