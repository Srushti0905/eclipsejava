package EmployeePackage;

public class TestEmployee {
 public static void main (String[] args) {
//	 
//	 Employee e = null;
//	 System.out.println(e.getSalary());
	 
	 Manager m = new Manager (1500, 800);
//	 System.out.println(m.getSalary());
	 
	 Clerk c = new Clerk (1200, 400);
//	 System.out.println(c.getSalary());
	 
//	 Employee e = m;
//	 System.out.println(e.getSalary());

	 showSalary(m);
	 showSalary(c); 
 }
// private static void showSalary(Employee e) { 
//		System.out.println("Employee Salary:" + e.getSalary());
//		
//	}
 private static void showSalary(Employee e) { 
	 if(e instanceof Manager)
		 System.out.println("Manager Salary:" + e.getSalary());
	 else 
		 System.out.println("Clerk Salary:" + e.getSalary());
	}
// private static void showSalary(Manager m) {
//		System.out.println("Manager Salary:" + m.getSalary());
//	
// }
// private static void showSalary(Clerk c) {
//		System.out.println("Clerk Salary:" + c.getSalary());
//		
//	}
//
}
