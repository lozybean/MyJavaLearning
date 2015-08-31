package Chapter7;
import static org.lozybean.util.Print.*;

class A{
	A(){
		println("A Constructor()");
	}
}
class B{
	B(){
		println("B Constructor()");
	}
}
class C extends A{
	B b = new B();
	C(){
		println("C Constructor()");
	}
	public static void main(String[] args){
		B b = new B();
	}
}

class Art {
	Art(){
		println("Art Constructor()");
	}
}
class Drawing extends Art{
	Drawing(){
		println("Draw Constructor()");
	}
}

public class Cartoon extends Drawing {
	public Cartoon(){
		println("Cartoon constructor()");
	}
	public static void main(String[] args){
		Cartoon x = new Cartoon();
		C c = new C();
	}
}
