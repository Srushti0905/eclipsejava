
public class StringDemo {
 
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String ("Hello");
		String s3 = "Hello";
		
		// == compares string methods so for s1== s2 it gives false bcz the reference pool is diff one is string and s2 is heap
		System.out.println( s1 == s2);
		System.out.println(s1 == s3 );
		
		s1 = s1+"World";
		System.out.println(s1);
        
		
		String name = "Srushti";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println(name.matches(nameRegex));
		
		String cell = "9423182566";
		String cellRegex = "[6-9][0-9]{9}";
		System.out.println(cell.matches(cellRegex));
		
		String email = "deokarsrushti9@gmail.com";
		String emailRegex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
		System.out.println(email.matches(emailRegex));				
		
	}
}
