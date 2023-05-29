package nestorcicardini.D1.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Merchandise extends Product {

	public Merchandise(String name, double price, double calories) {
		super(name, price, calories);
	}

}
