// Bible Books assignment by Kristopher Smolarek (CSC250)
// Create 3 instances of New Testament Books (test BibleBook class)

public class book_call
	{
	public static void main(String[] args)
		{
			BibleBook book1 = new BibleBook("Matthew");
			BibleBook book2 = new BibleBook("Mark");
			BibleBook book3 = new BibleBook("Luke");
	
			book1.num_chapters(28);
			book1.theme("The Life and Ministry of Jesus");
			book1.display();
			
			book2.num_chapters(16);
			book2.theme("The Compassionate Stories and Discourses of Jesus");
			book2.display();
			
			book3.num_chapters(24);
			book3.theme("Understanding Jesus's Life: How He Lived, Died, and Rose Again");
			book3.display();
		}
}