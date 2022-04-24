// Bible Books assignment by Kristopher Smolarek (CSC250)
// BibleBooks Class, instance variables + constructor

public class BibleBook
	{
		private String bookName;
		private int chapters;
		private String summary;
	
	// create contructor for (class) BibleBook
	public BibleBook(String bookName)
		{
			this.bookName = bookName;
		}
	// assign number of chapters to variable chapters
	public void num_chapters(int book_chapters)
		{
			chapters = book_chapters;
		}
	// assign summary to variable summary
	public void theme(String book_summary)
		{
			summary = book_summary;
		}
	public void display()
		{
			System.out.println("Gospel According to "+ bookName +" (" + chapters + " chapters)" + " - " + summary);
		}
}
