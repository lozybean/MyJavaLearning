package Chapter10.innerclasses;
import static org.lozybean.util.Print.*;
class Parcel5{
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
	}
}

class Parcel6{
	private String internalTracking(boolean b){
		if(b){
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			return s;
		}else{
			return "None";
		}
		// Can not use it here because inner class is out of scope;
		//! TrackingSlip ts = new TrackingSlip("x");
	}
	public String track(){
		return internalTracking(true);
	}
}

class Parcel7{
	public Contents contents(){
		return new Contents(){
			private int i = 11;
			public int value(){
				return i;
			}
		};
	}
}

class Wrapping{
	private int i;
	public Wrapping(int x){
		i = x;
	}
	public int value(){
		return i;
	}
}
class Parcel8{
	public Wrapping wrapping(int x){
		return new Wrapping(x){
			public int value(){
				return super.value() * 47;
			}
		};
	}
}

class Parcel9{
	public Destination destination(final String dest){
		return new Destination(){
			private String label = dest;
			public String readLabel(){
				return label;
			}
		};
	}
}

abstract class Base{
	public Base(int i){
		println("Base Constructor, i = " + i);
	}
	public abstract void f();
}

class AnonymousConstructor{
	public static Base getBase(final int i){
		return new Base(i){
			{
				println("Inside instance initializer, i = " + i);
			}
			public void f(){
				println("In anonymous f()");
			}
		};
	}
}

class Parcel10{
	public Destination destination(final String dest, final float price){
		return new Destination(){
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100){
					println("Over budget!");
				}
			}
			private String label = dest;
			public String readLabel(){
				return label;
			}
		};
	}
}

public class ParcelTest {
	public static void main(String[] args){
		Parcel5 p5 = new Parcel5();
		Destination d = p5.destination("Tasmania");
		println(d.readLabel());
		
		Parcel6 p6 = new Parcel6();
		println(p6.track());
		
		Parcel7 p7 = new Parcel7();
		Contents c = p7.contents();
		println(c.value());
		
		Parcel8 p8 = new Parcel8();
		Wrapping w = p8.wrapping(10);
		println(w.value());
		
		Parcel9 p9 = new Parcel9();
		Destination d9 = p9.destination("Tasmania");
		println(d9.readLabel());
		
		AnonymousConstructor ac = new AnonymousConstructor();
		Base base = ac.getBase(47);
		base.f();
		
		Parcel10 p10 = new Parcel10();
		Destination d10 = p10.destination("Tasmania", 101.395F);
	}

}
