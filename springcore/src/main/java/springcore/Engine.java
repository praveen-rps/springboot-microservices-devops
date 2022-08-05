package springcore;

public class Engine {
	
	
	String fuel;
	int strokes;
	int cylinders;
	
	@Override
	public String toString() {
		return "Engine [fuel=" + fuel + ", strokes=" + strokes + ", cylinders=" + cylinders + "]";
	}
	public Engine(String fuel, int strokes, int cylinders) {
		super();
		this.fuel = fuel;
		this.strokes = strokes;
		this.cylinders = cylinders;
	}
	public Engine() {
		
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getStrokes() {
		return strokes;
	}
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	
	

}
