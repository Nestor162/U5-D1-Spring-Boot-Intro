package nestorcicardini.D1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public abstract class Product {
	private String name;
	private double price;
	private int calories;

	public Product(String name, double price, int calories) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

}
