package Chapter10.controller;

public class GreenhouseControls extends Controller {
	private boolean light = false;
	public class LightOn extends Event{
		public LightOn(long delayTime){
			super(delayTime);
		}
		public void action(){
			light = true;
		}
		public String toString(){
			return "Light is on";
		}
	}
	public class LightOff extends Event{
		public LightOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			light = false;
		}
		public String toString(){
			return "Light is off";
		}
	}
	
	private boolean water = false;
	public class WaterOn extends Event{
		public WaterOn(long delayTime){
			super(delayTime);
		}
		public void action(){
			water = true;
		}
		public String toString(){
			return "Greenhouse water is on";
		}
	}
	public class WaterOff extends Event{
		public WaterOff(long delayTime){
			super(delayTime);
		}
		public void action(){
			water = false;
		}
		public String toString(){
			return "Greenhouse water is off";
		}
	}
	// ...
}
