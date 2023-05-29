package nestorcicardini.D1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;
import nestorcicardini.D1.entities.Pizza;

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

		Pizza pizzaMargherita = (Pizza) context.getBean("Pizza Margherita");
		log.info(pizzaMargherita.toString());

		context.close();
	}

}
