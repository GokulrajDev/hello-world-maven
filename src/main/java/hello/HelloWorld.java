package hello;

import org.joda.time.LocalTime;
// V2
public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("v10 luffy,Roronoa zoro, sanjii The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
