package Chapter9.interfaceprocessor;
import static org.lozybean.util.Print.*;

public class Apply {
	public static void process(Processor p, Object s){
		println("Using Processor " + p.name());
		println(p.process(s));
	}
}
