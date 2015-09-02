package Chapter9;
import static org.lozybean.util.Print.*;

enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}

interface Instrument{
	int VALUE = 5;
	void play(Note N);
	void adjust();
}

class Wind implements Instrument{
	public void play(Note n){
		println(this + ".play() " + n);
	}

	public void adjust() {
		println(this + ".adjust() ");
	}
	
	public String toString(){
		return "Wind";
	}

// it worked but not so clear
//	public void another(){
//		
//	}
}

class Percussion implements Instrument{

	public void play(Note N) {
		println(this + ".play() " + N);
	}

	public void adjust() {
		println(this + ".adjust()");
	}
	
	public String toString(){
		return "Percussion";
	}
}

class Stringed implements Instrument{

	public void play(Note N) {
		println(this + ".play() " + N);
	}

	public void adjust() {
		println(this + ".adjust()");
	}
	
	public String toString(){
		return "Stringed";
	}
}

class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}

class Woodwind extends Wind{
	public String toString(){
		return "Woodwind";
	}

//	public void another(){
//		println(this + ".another()");
//	}
}

public class Music5 {
	static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	static void tuneAll(Instrument[] e){
		for(Instrument i : e){
			tune(i);
		}
	}
	public static void main(String[] args){
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}
} /*output:
Wind.play() MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play() MIDDLE_C
Woodwind.play() MIDDLE_C
*/
