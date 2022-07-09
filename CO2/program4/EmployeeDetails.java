/* Program  to  create  a  class  for  Employee  having  attributes  eNo,  eName , eSalary. 
 Read  n employee information and Search for an employee given eNo, 
 using the concept of Array of Objects.*/

import java.util.Scanner;

class Employee{
    int eNo;
    String eName;
    int eSalary;

    void Getdata()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee id : ");
        eNo=Integer.parseInt(s.nextLine());
        System.out.println("Enter employee name : ");
        eName=s.nextLine();
        System.out.println("Enter employee salary : ");
        eSalary=Integer.parseInt(s.nextLine());
        System.out.println();
    }

    void Display()
    {
        System.out.print(eNo+"\t"+eName+" \t "+eSalary+"\n");
    }
}

public class EmployeeDetails{
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many employees you want to store : ");
        int n= s.nextInt();
        Employee emp[] = new Employee[n];
        int i;
        for(i=0;i<n;i++)
        {
            emp[i]=new Employee();
        }
        for(i=0;i<n;i++){
            System.out.println("Enter the details of "+(i+1)+" employee");
            emp[i].Getdata();
        }
        System.out.println("Enter Employee id to display information: ");
        
        int search =s.nextInt();
        for(i=0;i<n;i++){
            if(emp[i].eNo == search){
                emp[i].Display();
                break;
            }
            else {
                System.out.println("Employee with entered ID doesn't exist!");
            }
        }
    }
}
