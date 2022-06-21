import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LaptopApp {

	public static void main(String[] args) {

		List<Laptop> laptops = new ArrayList<Laptop>();

		laptops.add(new Laptop("dell", 45000, 256));
		laptops.add(new Laptop("hp", 53000, 512));
		laptops.add(new Laptop("lenovo", 42000, 128));

		Collections.sort(laptops);

		for (Iterator iterator = laptops.iterator(); iterator.hasNext();) {
			Laptop laptop = (Laptop) iterator.next();

		}

		System.out.println(laptops);

	}

}
