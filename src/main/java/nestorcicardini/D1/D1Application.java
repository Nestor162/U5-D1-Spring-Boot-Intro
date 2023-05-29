package nestorcicardini.D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import nestorcicardini.D1.entities.Topping;

@Slf4j
@SpringBootApplication
public class D1Application {

	public static void main(String[] args) {
		SpringApplication.run(D1Application.class, args);
		System.out.println();
		log.info("Benvenuti su Godfather's Pizza!" + System.lineSeparator());
		log.info("::::::::::::::::::::::: Menu ::::::::::::::::::::::::::");
		log.info("--- Pizzas ---");
		configWithAnnotation();

	}

	public static void configWithAnnotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				D1Application.class);

		log.info(context.getBean("pizzaMargherita").toString());
		log.info(context.getBean("hawaiianPizza").toString());
		log.info(context.getBean("salamiPizza").toString());
		log.info(context.getBean("familyPizza").toString());

		System.out.println();
		log.info("--- Toppings ---");
		log.info(context.getBean("cheese", Topping.class).showCompleteInfo());
		log.info(context.getBean("ham", Topping.class).showCompleteInfo());
		log.info(context.getBean("onions", Topping.class).showCompleteInfo());
		log.info(
				context.getBean("pineapple", Topping.class).showCompleteInfo());
		log.info(context.getBean("salami", Topping.class).showCompleteInfo());

		System.out.println();
		log.info("--- Drinks ---");
		log.info(context.getBean("lemonade").toString());
		log.info(context.getBean("water").toString());
		log.info(context.getBean("wine").toString());

		System.out.println();

		context.close();
	}

}
