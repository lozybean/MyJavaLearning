package Chapter8;
import static org.lozybean.util.Print.*;
enum Note{
	MIDDLE_C, C_SHARP, B_FLAT;
}
class Instrument{
	public void play(Note n){
		println("Instrument.play() " + n);
	}
}

class Wind extends Instrument{
	public void play(Note n){
		println("Wind.play() " + n);
	}
}

class Brass extends Wind{
	public void play(Note n){
		println("Brass.play() " + n);
	}
}

public class Music {
	public static void tune(Instrument i ){
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args){
		Wind flute = new Wind();
		tune(flute);
	}
}
