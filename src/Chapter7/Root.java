package Chapter7;
import static org.lozybean.util.Print.*;

class Component1{
	Component1(int i){
		println("Component1 Constructor");
	}
}
class Component2{
	Component2(int i){
		println("Component2 Constructor");
	}
}
class Component3{
	Component3(){
		println("Component3 Constructor");
	}
}
class Component4{
	Component4(){
		println("Component4 Constructor");
	}
}
public class Root {
	private Component1 c1 = new Component1(1);
	private Component2 c2 = new Component2(2);
	private Component3 c3 = new Component3();
	Root(){
		println("Root Constructor");
	}
}
class Stem extends Root{
	Stem(){
		println("Stem Constructor");
	}
	public static void main(String[] args){
		Stem s = new Stem();
	}
}