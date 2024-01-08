package carmen.bes5l1;

import carmen.bes5l1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeS5L1Application {

	public static void main(String[] args) {
		SpringApplication.run(BeS5L1Application.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeS5L1Application.class);

		Menu menu = ctx.getBean(Menu.class);
		menu.printMenu();
	}

}
