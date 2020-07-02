package nl.optimust.springframework.sfgdi;

import nl.optimust.springframework.sfgdi.controllers.ConstructedInjectedController;
import nl.optimust.springframework.sfgdi.controllers.MyController;
import nl.optimust.springframework.sfgdi.controllers.PropertyInjectedController;
import nl.optimust.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("------ Primary Bean");

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println(myController.sayHello());

		System.out.println("------ Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");

		ConstructedInjectedController constructedInjectedController = (ConstructedInjectedController) ctx.getBean("constructedInjectedController");

		System.out.println(constructedInjectedController.getGreeting());
	}

}
