package springcore;

public class Car {
	
	int model;
	String color;
	Engine engine;
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engine=" + engine + "]";
	}
	public Car(int model, String color, Engine engine) {
		super();
		this.model = model;
		this.color = color;
		this.engine = engine;
	}
	public Car() {
		
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
