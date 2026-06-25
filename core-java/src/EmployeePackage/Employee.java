//  abstract class cannot be directly instantiated so the right part may give error.
package EmployeePackage;

public abstract class Employee {
   private double salary;

   public Employee(double salary) {
	super();
	this.salary = salary;
   }

   public double getSalary() {
	return salary;
   }

   
   
   
}
