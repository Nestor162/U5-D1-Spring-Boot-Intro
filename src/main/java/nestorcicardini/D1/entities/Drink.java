package nestorcicardini.D1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Drink extends Product {

	public Drink(String name, double price, int calories) {
		super(name, price, calories);
	}
}
