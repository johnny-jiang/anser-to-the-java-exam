package exam2013.q2;

public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public String toString() {
		return "side1: " + side1 + " side2: " + side2 + " side3: " + side3
				+ " colour: " + this.getColour();
	}

	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		double s = (side1 + side2 + side3) / 3;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public boolean isValid() {
		if (side1 + side2 > side3 && side1 + side3 > side2
				&& side3 + side2 > side1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Triangle t = new Triangle(1.5, 2.0, 0.8);
		t.setColour("blue");
		double area = t.getArea();
		System.out.println("area: " + area);
		System.out.println(t.toString());
	}

}
