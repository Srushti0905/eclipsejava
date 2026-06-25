package Library;
public class TestLibrary {

    public static void main(String[] args) {

        Book b1 = new Book("The Summer I Turned Pretty");
        Book b2 = new Book("Atomic Habits");

        Member m1 = new Member("Jenny Han");
        Member m2 = new Member("James Clear");

        System.out.println("Book Status:");
        b1.status();
        b2.status();

        System.out.println("\nMember Status:");
        m1.status();
        m2.status();

        System.out.println("\nPrinting Objects:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println(m1);
        System.out.println(m2);
        
    }
}


//public class TestLibrary {
//	
//	public static void main(String[] args) {
//		Book b1 = new Book("The Alchemist");
//		Book b2 = new Book("Kite Runner");
//		
//		Member m1 = new Member("Krishna");
//		Member m2 = new Member("George");
//		
//		b1.status();
//		m1.status();
//		
//		//issue book to member
//		
//		//print their status
//		
//		//return book from member
//	}
//}
