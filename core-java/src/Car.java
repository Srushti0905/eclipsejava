//Variable Arguments
public class Car {
 private String model;
 private String[] features;
 public Car(String model, String... features) {
	super();
	this.model = model;
	this.features = features;
 }
 public void specs() {
	 System.out.println("Feature of "+ model);
	 for (String f : features)
		 System.out.println(f);
	 
 }
 public static void main(String[] args) {
	
	String [] features = {"Seatbelts","Airbags"};	
	Car c1 = new Car ( "Thar", features);
    c1.specs();
    System.out.println("\n");
    Car c2 = new Car("Astor ","Keyless","ABS","ADAS","Cruise");
    c2.specs();

}
}
