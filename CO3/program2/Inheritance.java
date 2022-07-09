
/* Create  a  class  ‘Employee’  with  data  members  Empid,  Name,  Salary,  Address  and 
constructors to initialize the data members. Create another class ‘Teacher’ that inherit the 
properties of class employee and contain its own data members department, Subjects taught 
and  constructors  to  initialize  these  data  members  and  also  include  display  function  to 
display all the data members. Use array of objects to display details of N teachers.*/

import java.util.Scanner;
class Employee{
	int Empid;
	String Name;
	double Salary;
	String Address;

	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Empid:");
		Empid=sc.nextInt();
		System.out.println("Enter the Name:");
		Name=sc.next();
		System.out.println("Enter the Salary:");
		Salary=sc.nextInt();
		System.out.println("Enter the Address:");
		Address=sc.next();
	}
	
}
class Teacher extends Employee{
	String department;
	String Subject;

	Teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the department:");
		department=sc.next();
		System.out.println("Enter the subject taught:");
		Subject=sc.next();
		System.out.println();
		}
		
	void display(){
			System.out.println("Employee id:"+Empid);
			System.out.println("Name:"+Name);
			System.out.println("address:"+Address);
			System.out.println("department:"+department);
			System.out.println("subject:"+Subject);
			System.out.println();
		}
	
}
class Inheritance{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of teachers:");
		int n=sc.nextInt();
		Teacher[] teacher=new Teacher[n];
		for(int i=0;i<n;i++)
		teacher[i]=new Teacher();
		System.out.println("Details of teachers");
		for(int i=0;i<n;i++){
			System.out.println();
			teacher[i].display();
		}
	
	}
}
