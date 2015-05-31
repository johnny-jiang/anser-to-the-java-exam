package exam2013.q4;

import java.util.*;

public class ComparableCars {
	
	public static void main(String[] args) {
		List<Car> lst = new ArrayList<Car>();
		lst.add(new Car("Fiat", 8000));
		lst.add(new Car("Ferrari", 8000));
		lst.add(new Car("Ford", 5000));
		Collections.sort(lst);
		Iterator itr = lst.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
	}
}
