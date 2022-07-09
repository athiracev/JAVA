//  Add complex numbers

import java.util.*;
class Complex
{
	
	int r1,r2,r3,i1,i2,i3;
	
	void data()
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter real value and image value of first complex number");
		r1=n.nextInt();
		i1=n.nextInt();
		System.out.println("Enter real value and image value of second complex number");
		r2=n.nextInt();
		i2=n.nextInt();
		r3=r1+r2;
		i3=i1+i2;
		System.out.println(r3+"+"+i3+"i");
	}
}
class Program3
{
	public static void main(String a[])
	{
		Complex c=new Complex();
		c.data();
	}
}
