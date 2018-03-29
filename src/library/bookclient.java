package library;

import java.awt.print.Book;

public class bookclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author=new Author("nikhil","goa university");
		book javabook=new book("java programming","nikhil",3000,300);
		//author.setBook(javabook);
		//book cbook=new book();
		
		
		//get the name of the author of javabook
		 
		System.out.println(javabook.author);
		//System.out.println(javabook.getAuthor().getName());
		
		javabook.setPrice(30);
        System.out.println(javabook.getPrice());
        
        javabook.setTitle("supper");
        System.out.println(javabook.getTitle());
        
        javabook.setAuthor("nikhil");
        System.out.println(javabook.getAuthor());
        
        javabook.setPages(100);
        System.out.println(javabook.getPages());
      //  Book cplusBook=new Book("c#",new author("omkar","goa"),700,345);
        //Book cSharp=new Book("abc","nikhil",300,10);
        System.out.println(author.getName());
	}

}
