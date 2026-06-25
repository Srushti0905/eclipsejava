package Library;

public class Book {
 private String title;
 
private Member mbr;

public Book(String title) {
	this.title= title;
}
@Override
public String toString() {
	return "Book [Title ="+ title+"]";
}
public void status() {
if (mbr== null)
	System.out.println(title +"Not issued to any member");
else
	System.out.println(title +" issued to a member"+ mbr);

	
}
}
