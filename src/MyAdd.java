import java.util.ArrayList;

public class MyAdd 
{
	ArrayList<Cart> add1= new ArrayList<Cart>();
	
	public void  addcart() 
	{	
		Cart x = new Cart() ;
		add1.add(x) ; 
	}
	
	public void addProduct(int cart , int price , String name, int count) 
	{
		Product n = new Product() ;
		n.setName(name); 
		n.setCount(count);
		n.setPrice(price);
		add1.get(cart).prodList.add(n);
	}
}
