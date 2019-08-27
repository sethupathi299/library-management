package student;
import java.util.*;
public class library {
	public static void main(String[] args) {

		  
		class Book {  
		int id;  
		String name,author,publication;  
		int quantity;  
		public Book(int id, String name, String author, String publication, int quantity) {  
		    this.id = id;  
		    this.name = name;  
		    this.author = author;  
		    this.publication = publication;  
		    this.quantity = quantity;  
		}  
		}  
		
		      
		    List<Book> list=new ArrayList<Book>();  
		      
		    Book b1=new Book(1,"digital communication:","sujatha:","sujatha publication:",12);  
		    Book b2=new Book(2,"computer programming:","jeya lakshmi:","jeya publication:",56);  
		    Book b3=new Book(3,"Operating System:","arun:","arun kumar:",23);  
		   
		    list.add(b1);  
		    list.add(b2);  
		    list.add(b3);  
		    
		    for(Book b:list){  
		        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publication+" "+b.quantity);  
		    }  
		}  
		  
}
