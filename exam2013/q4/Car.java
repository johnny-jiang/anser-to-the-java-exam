package exam2013.q4;

public class Car implements Comparable {
	String make;
	int mileage;

	public Car(String make, int mileage) {
		this.make = make;
		this.mileage = mileage;
	}

	public String toString() {
		return "mileage: " + mileage + " make: " + make;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO 自动生成的方法存根
		return this.mileage - ((Car) arg0).mileage;
	}
}
