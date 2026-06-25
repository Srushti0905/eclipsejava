//lambda is only done usig sam (functional interface) @FunctionalInterface means this interface must have only one abstract method


@FunctionalInterface
interface Hello{
	String greet();
	
	default void demo() {    // if we put only void it gives error since we use functional interface 
		System.out.println("hello demo");
	}
	static void test() {
		System.out.println("hello Test");
	}
	private String  temp() {
		return "Hello temp"; // calling this will give error since its pvt
		
	}
}

@FunctionalInterface
interface Printer{
	void print (String name);
	
}
public class LambdaDemo {
public static void main(String[] args) {
	Hello h1 = () -> "Hello Lambda";
	System.out.println(h1.greet());
	h1.demo();
	Hello.test();
	
	
	Hello h2 = () ->{
		String msg ="Bonjour Lambda";
		return msg;
		
	};// using curly makes return mandatory
	System.out.println(h2.greet());
	
	Printer p1 = (name) -> System.out.println(name);
	p1.print("Srushti");
	
	Printer p2 = System.out::println;
	p2.print("Amazing");
	
	// method reference
}
}
