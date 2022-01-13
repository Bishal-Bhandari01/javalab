import java.util.Scanner;

public class QN34 {
	
	Scanner s = new Scanner(System.in);

	QN34(){
		System.out.print("Enter book name: ");
		String bookName = s.nextLine();
	
		System.out.print("Enter author name: ");
		String authorName = s.nextLine();
	
		System.out.print("Enter book price: ");
		int bookPrice = s.nextInt();
	
		System.out.print("Enter total number of pages in book: ");
		int noP = s.nextInt();
	
		System.out.println("\nBook information");
		System.out.println("Book Name: " + bookName);
		System.out.println("Author: " + authorName);
		System.out.println("Price: " + bookPrice);
		System.out.println("Total no. of pages: " + noP);
	}
	public static void main(String[] args){
		QN34 qn = new QN34();
	}

}
