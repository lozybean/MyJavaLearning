package Chapter10;
import static org.lozybean.util.Print.*;

interface A{}
interface B{}

class X implements A,B{}
class Y implements A{
	B makeB(){
		return new B(){};
	}
}

abstract class C{};
abstract class D{};

class Z extends C{
	D makeD(){
		return new D(){
			
		};
	}
}


interface Selector{
	char getCharAt(int i);
}

class Sequence {
	private String s;
	Sequence(String s){
		this.s = s;
	}
	private Selector fs(){
		return new Selector(){
			public char getCharAt(int i){
				return s.charAt(i);
			}
		};
	}
	private Selector rs(){
		return new Selector(){
			public char getCharAt(int i){
				int index = s.length() - i;
				return s.charAt(index);
			}
		};
	}
	public char forwardSelector(int i){return fs().getCharAt(i);}
	public char reverseSelector(int i){return rs().getCharAt(i);}
}

public class MultiImplementation {
	public static void main(String[] args){
		Sequence str = new Sequence("abcdedf");
		println(str.forwardSelector(2));
		println(str.reverseSelector(7));
	}
}
