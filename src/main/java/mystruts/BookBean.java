package mystruts;

public class BookBean 
{
	private String bookname;
	private int price;
	
	public void setBookname(String x)
	{
		bookname = x;
	}
	public String getBookname()
	{
		return bookname;
	}
	public void setPrice(int y)
	{
		price = y;
	}
	public int getPrice()
	{
		return price;
	}
}
