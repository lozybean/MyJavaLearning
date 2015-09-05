package Chapter10.staticinnerclasses;
import static org.lozybean.util.Print.*;

public class TestBed {
	public void f(){
		println("f()");
	}
	public static class Tester{
		public static void main(String[] args){
			TestBed t = new TestBed();
			t.f();
		}
	}
}
