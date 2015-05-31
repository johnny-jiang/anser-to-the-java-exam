package exam2013.q2;

public abstract class Shape {
	private String colour = "white"; // the colour of the shape, default "white"

	public Shape() {
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public abstract double getArea(); // calculate the area of the shape
}
