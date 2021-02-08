package assign;

public class TestDemo {

	public static void main(String[] args) {
		Book EngineeringBook =new Book(1234,"Java: A Begineers guide" , "Herbert Schildt", 680);
		EngineeringBook.getBookNo();
		System.out.println(EngineeringBook.getBookNo());
		EngineeringBook.getAuthor();
		System.out.println(EngineeringBook.getAuthor());
		EngineeringBook.getTitle();
		System.out.println(EngineeringBook.getTitle());
		EngineeringBook.getPrice();
		System.out.println(EngineeringBook.getPrice());
	}

}
