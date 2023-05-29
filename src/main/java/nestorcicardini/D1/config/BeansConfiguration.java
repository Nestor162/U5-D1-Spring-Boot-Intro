package nestorcicardini.D1.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nestorcicardini.D1.entities.Pizza;
import nestorcicardini.D1.entities.Product;
import nestorcicardini.D1.entities.Topping;

@Configuration
public class BeansConfiguration {

	// TOPPINGS
	@Bean(name = "tomato")
	Topping tomato() {
		return new Topping("Tomato", 0, 0);
	}

	@Bean(name = "cheese")
	Topping cheese() {
		return new Topping("cheese", 0.69, 92);
	}

	@Bean(name = "ham")
	Topping ham() {
		return new Topping("ham", 0.99, 35);
	}

	@Bean(name = "onions")
	Topping onions() {
		return new Topping("onions", 0.69, 22);
	}

	@Bean(name = "pinaple")
	Topping pinaple() {
		return new Topping("pinaple", 0.79, 24);
	}

	@Bean(name = "salami")
	Topping salami() {
		return new Topping("salami", 0.99, 86);
	}

	// PIZZE
	@Bean(name = "Pizza Margherita")
	Product getPizzaMargherita() {
		List<Topping> listaToppings = new ArrayList<>();
		listaToppings.add(tomato());
		listaToppings.add(cheese());
		return new Pizza("Pizza Margherita", 4.99, 1104, listaToppings, "sm");
	}
}
