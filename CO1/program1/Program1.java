/* Define a class ‘product’ with data members pcode, pname and price. 
Create 3 objects of the class and find the product having the lowest price.*/

import java.io.*;

class Product
{
	int pcode;
	int price;
	String pname;
}

class Program1{
	public static void main(String a[])
	{
		Product k = new Product();
		Product j = new Product();
		Product l = new Product();
		k.pcode = 111;
		k.price = 55;
		k.pname = "Book";
		j.pcode = 222;
		j.price = 5;
		j.pname = "pen";
		l.pcode = 333;
		l.price = 150;
		l.pname = "Box";
		System.out.println("Name = "+k.pname+" Code = "+k.pcode+" price ="+k.price);
		System.out.println("Name = "+l.pname+" Code = "+l.pcode+" price ="+l.price);
		System.out.println("Name = "+j.pname+" Code = "+j.pcode+" price ="+j.price);
		System.out.println("Lowest Price");
		if(k.price < l.price && k.price < j.price)
		{
			System.out.println("Name = "+k.pname+" Code = "+k.pcode+" price ="+k.price);
		}
		else if(l.price < j.price)
		{
			System.out.println("Name = "+l.pname+" Code = "+l.pcode+" price ="+l.price);
		}
		else
		{
			System.out.println("Name = "+j.pname+" Code = "+j.pcode+" price ="+j.price);
		}
	}
}
