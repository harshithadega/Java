package testjava;

public abstract class Shape {
	protected int length;
	protected int breadth;
	protected int radius;
	public Shape(String length,String breadth){
		this.length=Integer.parseInt(length);
		this.breadth=Integer.parseInt(breadth);
	}
	public Shape(String radius){
		this.radius=Integer.parseInt(radius);
	}
	abstract void area();
}