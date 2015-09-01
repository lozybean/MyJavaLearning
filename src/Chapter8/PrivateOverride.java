package Chapter8;
import static org.lozybean.util.Print.*;

public class PrivateOverride {
	private void f(){
		println("private f()");
	}
	public static void main(String[] args){
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride{
	public void f(){
		println("public f()");
	}
}