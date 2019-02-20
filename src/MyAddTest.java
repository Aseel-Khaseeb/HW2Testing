import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MyAddTest
{
	@Test
	public void testAddcart() 
	{
		Cart ass = new Cart() ;
		assertTrue(0 == ass.getTotal()) ;
	}

	@Test
	public void testAddProduct() 
	{
		MyAdd r = new MyAdd() ;
		r.addcart();
		r.addProduct(0, 127,"Java Book", 1);
		assertTrue(1==r.add1.get(0).prodList.size()) ;
		assertTrue(127 == r.add1.get(0).prodList.get(0).getPrice()) ;
		r.add1.get(0).prodList.clear();
		r.add1.clear();
	}
	
	@Test
	public void testAddProduct2() 
	{
		MyAdd y = new MyAdd() ; 
		y.addcart();
		y.addProduct(0, 127,"Java Book", 1);
		y.addProduct(0, 100,"Web desing Book", 1);
		assertTrue(2==y.add1.get(0).prodList.size()) ;
		assertTrue(227 == y.add1.get(0).getTotal()) ;	
		y.add1.get(0).prodList.clear();
		y.add1.clear();
	}
	
	@Test
	public void testAddProduct3() 
	{
		MyAdd z = new MyAdd() ; 
		z.addcart();
		z.addProduct(0, 127,"Java Book", 1);
		z.addProduct(0, 100,"Web desing Book", 1);
		z.addProduct(0, 120,"C++ Book", 1);
		assertTrue(3==z.add1.get(0).prodList.size()) ;
		assertTrue(347 == z.add1.get(0).getTotal()) ;	
		z.add1.get(0).prodList.clear();
		z.add1.clear();
	}
	
	@Test
	public void testAddProduct4() 
	{
		MyAdd b = new MyAdd() ; 
		b.addcart();
		b.addProduct(0, 127,"Java Book", 1);
		b.addProduct(0, 100,"Web desing Book", 1);
		b.addProduct(0, 120,"C++ Book", 1);
		b.addProduct(0, 300,"Database Book", 1);
		assertTrue(4==b.add1.get(0).prodList.size()) ;
		assertTrue(647 == b.add1.get(0).getTotal()) ;	
		b.add1.get(0).prodList.clear();
		b.add1.clear();
	}
	
	@Test
	public void testAddProduct5() 
	{
		MyAdd v = new MyAdd() ; 
		v.addcart();
		v.addProduct(0, 127,"Java Book", 1);
		v.addProduct(0, 100,"Web desing Book", 1);
		v.addProduct(0, 120,"C++ Book", 1);
		v.addProduct(0, 300,"Database Book", 1);
		assertFalse(6==v.add1.get(0).prodList.size()) ;
		assertFalse(600 == v.add1.get(0).getTotal()) ;	
		v.add1.get(0).prodList.clear();
		v.add1.clear();
	}
	
	@Test
	public void testAddProduct6() 
	{
		MyAdd k = new MyAdd() ; 
		k.addcart();
		k.addProduct(0, 127,"Java Book", 1);
		k.addProduct(0, 100,"Web desing Book", 1);
		k.addProduct(0, 120,"C++ Book", 1);
		k.addProduct(0, 300,"Database Book", 1);
		k.addProduct(0, 200,"DataStructure Book", 1);
		assertFalse(7==k.add1.get(0).prodList.size()) ;
		assertFalse(600 == k.add1.get(0).getTotal()) ;	
		k.add1.get(0).prodList.clear();
		k.add1.clear();
	}
}