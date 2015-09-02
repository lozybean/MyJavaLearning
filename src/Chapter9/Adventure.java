package Chapter9;
import static org.lozybean.util.Print.*;

interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
class ActionCharacter{
	public void fight(){
		println(this.getClass() + " is fighting");
	}
}
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{
	public void swim(){
		println("Hero is swimming");
	}
	public void fly(){
		println("Hero is flying");
	}
}
public class Adventure {
	public static void t(CanFight x) {
		x.fight();
	}
	public static void u(CanSwim x){
		x.swim();
	}
	public static void v(CanFly x){
		x.fly();
	}
	public static void w(ActionCharacter x){
		x.fight();
	}
	public static void main(String[] args){
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}/*output
class Chapter9.Hero is fighting
Hero is swimming
Hero is flying
class Chapter9.Hero is fighting
*/
