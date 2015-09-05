package Chapter10;
import static org.lozybean.util.Print.*;

interface Incrementable{
	void increment();
}

class Callee1 implements Incrementable{
	private int i = 0;
	public void increment(){
		i++;
		println(i);
	}
}
class MyIncrement{
	public void increment(){
		println("Other operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}

class Callee2 extends MyIncrement{
	private int i = 0;
	public void increment(){
		super.increment();
		i++;
		println(i);
	}
	private void increment2(){
		println("callback increment: i= " + i);
	}
	private class Closure implements Incrementable{
		public void increment(){
			Callee2.this.increment2();
		}
	}
	Incrementable getCallbackReference(){
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh){
		callbackReference = cbh;
	}
	void go(){
		callbackReference.increment();
	}
}

public class Callbacks {
	public static void main(String[] args){
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		c1.increment();
		c2.increment();
//		MyIncrement.f(c2);
		println("+++");
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}/*output
Other operation
1
1
2
Closure i= 1
Closure i= 2
*/
