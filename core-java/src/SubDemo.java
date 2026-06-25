//inheritance of a generic class.
public class SubDemo<T, P> extends Demo<T> {
  private P temp;

  public SubDemo(T data, P temp) {
	super(data);
	this.temp = temp;
  }

  public P getTemp() {
	return temp;
  }

  public void setTemp(P temp) {
	this.temp = temp;
  }
  public static void main(String[] args) {
	SubDemo<String,Integer> sd = new SubDemo<String, Integer>("Srushti", 21);
	System.out.println(sd.getData()+ "\t" +sd.getTemp());
	
	SubDemo<Double,Person> sd1 = new SubDemo<Double, Person>(22.22, new Person("Bob",12));
	System.out.println(sd1.getData()+ "\t" +sd1.getTemp());
	
}	 
	
}
