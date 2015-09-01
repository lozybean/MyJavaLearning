package Chapter8;
class Useful{
	public void f(){};
	public void g(){};
}
class MoreUseful extends Useful{
	public void f(){};
	public void g(){};
	public void u(){};
}
public class RTTI {
	public static void main(String[] args){
		Useful[] x = {
			new Useful(),
			new MoreUseful()
		};
		x[0].f();
		x[1].f();
		// Compile time : method not found in Useful
		//! x[1].u();
	}
}
