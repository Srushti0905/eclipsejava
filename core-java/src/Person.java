
public class Person implements Cloneable{ // if used cloneable java is not responsible it give persimmison to clone

	private String name;
	private int age;
	
//	public Person() {
//		name = "Anonymous";
//		age = -1;
//	}
//	Calling another constructor on same object is called constructor chaining.Constructor chaining is the process of calling one constructor from another constructor in the same class or parent class.
	public Person() {
		this ("Anonymous", -1);     // constuctor chaining 
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: "+ name +", Age: " + age);
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person )obj;
			if (this.age == p.age && name.equals (p.name))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person ("Srushti ",21);
		p1.print();
		
		Person p2 = new Person ();
		p2.print();
		
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode());
		
		System.out.println(p1); // implicitly calls toString() on object 
		
		System.out.println(p1.equals(p2)); // Memory View p1 ──► Person("Srushti",21) p2 ──► Person("Anonymous",-1)Different objects ⇒ equals() returns false.
	
	    Person pc =(Person)  p1.clone();
       System.out.println(pc);	   
	}
	
}