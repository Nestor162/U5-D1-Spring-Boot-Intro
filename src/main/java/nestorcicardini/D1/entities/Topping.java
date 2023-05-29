package nestorcicardini.D1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Topping extends Product {
	public Topping(String name, double price, int calories) {
		super(name, price, calories);
	}

	@Override
	public String toString() {
		return getName();
	}

}
