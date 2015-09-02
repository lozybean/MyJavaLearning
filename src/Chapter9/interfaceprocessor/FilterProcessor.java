package Chapter9.interfaceprocessor;
import Chapter9.filters.*;
class FilterAdapter implements Processor{

	Filter filter;
	
	FilterAdapter(Filter filter){
		this.filter = filter;
	}
	
	public String name() {
		return filter.name();
	}

	public Object process(Object input) {
		return filter.process((Waveform)input);
	}
	
}
public class FilterProcessor {
	public static void main(String[] args){
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0,4.0)), w);
	}
}/*output
Using Processor LowPass
Waveform 0
Using Processor HighPass
Waveform 0
Using Processor BandPass
Waveform 0
*/
