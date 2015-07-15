package ca.fresher;
import junit.framework.*;
public class testClass extends TestCase{

	public void testPositive1()
	{
		String str="2 2 + 3 *";
		Calculator value= new Calculator();
		assertEquals("12",value.result(str));
	}
	
	
	/*public void testPositive2()
	{
		String str="3 1 – 2 2 + *";
		Calculator value= new Calculator();
		assertEquals("8",value.result(str));
	} */
	
	public void testPositive3()
	{
		String str="1 2 3 + -";
		Calculator value= new Calculator();
		assertEquals("-4",value.result(str));
	}
	
	public void testPositive4()
	{
		String str="6 2 * 3 /";
		Calculator value= new Calculator();
		assertEquals("4",value.result(str));
	}
	
	
	public void testPositive5()
	{
		String str="4 3 4 + 5 1 + 2 * + +";
		Calculator value= new Calculator();
		assertEquals("23",value.result(str));
	}
	
	public void testPositive6()
	{
		String str="2.5 1.3 -";
		Calculator value= new Calculator();
		assertEquals("1.2",value.result(str));
	}
	
	
	public void testNegative1()
	{
		String str="";
		Calculator value= new Calculator();
		assertEquals("Invalid expression",value.result(str));
		
	}
	
	public void testNegative2()
	{
		String str="3+4-";
		Calculator value= new Calculator();
		assertEquals("Invalid expression",value.result(str));
		
	}
	
	public void testNegative3()
	{
		String str="1 1 2 4";
		Calculator value= new Calculator();
		assertEquals("Invalid expression",value.result(str));
		
	}
	
	public void testNegative4()
	{
		String str="+-*";
		Calculator value= new Calculator();
		assertEquals("Invalid expression",value.result(str));
		
	}
	
	public void testNegative5()
	{
		String str="abcd%";
		Calculator value= new Calculator();
		assertEquals("Invalid expression",value.result(str));
		
	}
	public void testNegative6()
	{
		String str="10/";
		Calculator value= new Calculator();
		assertEquals("Invalid expression",value.result(str));
		
	}
		


}
