package Chapter10;
import static org.lozybean.util.Print.*;

public class Parcel {
	class Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c = contents();
		Destination d = to(dest);
		println(c.value());
		println(d.readLabel());
	}
	public static void main(String[] args){
		Parcel p = new Parcel();
		p.ship("Tasmania");
		Parcel q = new Parcel();
		Parcel.Contents c = q.contents();
		Parcel.Destination d = q.to("Borneo");
		println(c.value());
		println(d.readLabel());
		Parcel q2 = new Parcel();
		Parcel.Contents c2 = q2.new Contents();
		Parcel.Destination d2 = q2.new Destination("BBBs");
		println(c2.value());
		println(d2.readLabel());
	}
}
