import java.util.ArrayList;

public class Cart 
{
	ArrayList<Product> prodList;
	
	Cart()
	{
		prodList = new ArrayList<Product>();
	}
	
	public int getSize()
	{
		return prodList.size();
	}
	
	public int getTotal()
	{
		int total = 0;
		int i = getSize();
		for(int x = 0; x<i; x++)
		{
			total += prodList.get(x).getPrice();
		}
		return total;
	}
}